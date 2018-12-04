package br.com.batch.processor;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import br.com.batch.configuration.CsvConfig;
import br.com.batch.databases.repository.CustomerAddressEntityRepository;
import br.com.batch.databases.repository.CustomerEntityGridFlatRepository;
import br.com.batch.databases.repository.CustomerEntityRepository;
import br.com.batch.model.Customer;
import br.com.batch.model.CustomerAddressEntity;
import br.com.batch.model.CustomerEntity;
import br.com.batch.model.CustomerEntityGridFlat;
import br.com.batch.model.DirectoryCountryRegion;
import br.com.batch.model.enums.CreateInType;
import br.com.batch.utils.SessionUtil;

@Component
public class SaveItemCustomerProcessor implements ItemProcessor<Customer, Customer> {

	public static final Logger logger = LoggerFactory.getLogger(SaveItemCustomerProcessor.class);

	@Autowired
	private CsvConfig csvConfig;

	@Autowired
	private CustomerEntityRepository customerEntityRepository;

	@Autowired
	private CustomerAddressEntityRepository customerAddressEntityRepository;

	@Autowired
	private CustomerEntityGridFlatRepository customerEntityFlatRepository;

	@Override
	public Customer process(Customer saveItem) throws Exception {

		logger.info("Iniciando Processamento: {}", saveItem);

		// inserindo o Customer como Entidade
		CustomerEntity customer = new CustomerEntity();
		customer.setWebSiteId(1);
		String email = saveItem.getContato().getEmail().toLowerCase();

		if (email == null || email.length() == 0) {
			email = saveItem.getCnpj().replace(".", "").replace("/", "").replace("-", "");
		}else {
			if(customerEntityRepository.findByEmail(email)!=null) {
				email+=email+System.currentTimeMillis();
			}
		}

		customer.setEmail(email);
		customer.setGroupId(1);
		customer.setStoreId(1);
		customer.setIsActive(1);
		customer.setDisableAutoGroupChange(0);
		customer.setCreatedIn(CreateInType.DEFAULT_STORE_VIEW.getValue());
		customer.setPrefix(saveItem.getNomeFantasia());
		String[] nomes = saveItem.getNomeFantasia().split(" ");
		customer.setFirstName(nomes[0]);
		customer.setLastName(nomes[nomes.length - 1]);
		customer.setFailuresNum(0);

		customer = customerEntityRepository.save(customer);

		logger.info("Inserindo na tabela customer_entity: {}", customer);

		saveItem.setEntityId(customer.getEntityId());

		CustomerAddressEntity customerAddress = new CustomerAddressEntity();
		customerAddress.setParentID(customer.getEntityId());
		customerAddress.setIsActive(1);
		customerAddress.setCity(saveItem.getEnderecos().get(0).getCidade());

		Map<String, DirectoryCountryRegion> mapCountryRegion = SessionUtil.getInstance().getMapCountryRegion();

		DirectoryCountryRegion dTemp = mapCountryRegion.get(saveItem.getEnderecos().get(0).getUf().toUpperCase());
		customerAddress.setCountryId(dTemp.getCountryId());
		customerAddress.setFirstName(nomes[0]);
		customerAddress.setLastName(nomes[nomes.length - 1]);
		customerAddress.setPostCode(saveItem.getEnderecos().get(0).getCep().replace("-", ""));
		customerAddress.setPrefix(saveItem.getEnderecos().get(0).getTipoDeEndereco());
		customerAddress.setRegion(saveItem.getEnderecos().get(0).getEstado());
		customerAddress.setRegionId(dTemp.getRegionId());

		StringBuilder logradouroFull = new StringBuilder();
		logradouroFull.append(saveItem.getEnderecos().get(0).getLogradouro());
		logradouroFull.append(" ");
		logradouroFull.append(saveItem.getEnderecos().get(0).getNumero());
		logradouroFull.append(" ");
		logradouroFull.append(saveItem.getEnderecos().get(0).getComplemento());
		logradouroFull.append(" ");
		logradouroFull.append(saveItem.getEnderecos().get(0).getBairro());
		customerAddress.setStreet(logradouroFull.toString());
		customerAddress.setTelephone(saveItem.getContato().getTelefonePrincipal());

		customerAddress = customerAddressEntityRepository.save(customerAddress);
		logger.info("Inserindo na tabela customer_address_entity: {}", customerAddress);

		CustomerEntityGridFlat customerEntityFlat = new CustomerEntityGridFlat();
		customerEntityFlat.setEntityId(saveItem.getEntityId());
		customerEntityFlat.setName(saveItem.getRazaoSocial());
		customerEntityFlat.setEmail(email);
		customerEntityFlat.setGroupId(1);
		customerEntityFlat.setWebSiteId(1);
		customerEntityFlat.setCreatedIn(CreateInType.DEFAULT_STORE_VIEW.getValue());

		logradouroFull.append(saveItem.getEnderecos().get(0).getCidade());
		logradouroFull.append(" ");
		logradouroFull.append(dTemp.getDefaultName());
		logradouroFull.append(" ");
		logradouroFull.append(saveItem.getEnderecos().get(0).getCep());

		customerEntityFlat.setShippingFull(logradouroFull.toString());
		customerEntityFlat.setBillingFull(logradouroFull.toString());
		customerEntityFlat.setBillingFirstName(nomes[0]);
		customerEntityFlat.setBillingLastName(nomes[nomes.length - 1]);
		customerEntityFlat.setBillingTelephone(saveItem.getContato().getTelefonePrincipal());
		customerEntityFlat.setBillingPostCode(saveItem.getEnderecos().get(0).getCep());
		customerEntityFlat.setBillingCountryId(dTemp.getCountryId());
		customerEntityFlat.setBillingRegion(dTemp.getDefaultName());
		customerEntityFlat.setBillingCity(saveItem.getEnderecos().get(0).getCidade());

		StringBuilder street = new StringBuilder();
		street.append(saveItem.getEnderecos().get(0).getLogradouro());
		street.append(" ");
		street.append(saveItem.getEnderecos().get(0).getNumero());

		customerEntityFlat.setBillingStreet(street.toString());

		customerEntityFlat = customerEntityFlatRepository.save(customerEntityFlat);

		SessionUtil.getInstance().getCustomers().add(saveItem);

		return saveItem;
	}

}
