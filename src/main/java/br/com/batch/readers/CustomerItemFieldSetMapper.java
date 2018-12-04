package br.com.batch.readers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

import br.com.batch.configuration.CsvConfig;
import br.com.batch.model.Contato;
import br.com.batch.model.Customer;
import br.com.batch.model.Endereco;

@Component
public class CustomerItemFieldSetMapper implements FieldSetMapper<Customer> {

	private CsvConfig csvConfig;
	
	public CustomerItemFieldSetMapper() {
		
	}
	
	public CustomerItemFieldSetMapper(CsvConfig csvConfig) {
		this.csvConfig = csvConfig;
	}
	
	public Customer mapFieldSet(FieldSet arg) {

		Customer customer = new Customer();
		List<String> fields = csvConfig.getNamesCols();
		
		Map<String, String> dataTemp = new HashMap<String, String>();		
		for(String field : fields) {
			dataTemp.put(field, arg.readString(field));
		}
		
		
		
		int i = 0;
		customer.setCnpj(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		customer.setNomeFantasia(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		customer.setRazaoSocial(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		customer.setCategoria(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setNumero(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setComplemento(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setBairro(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setCidade(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setUf(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setCep(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setEstado(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		endereco.setPais(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		
		Contato contato = new Contato();
		contato.setTelefonePrincipal(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		contato.setTelefoneSecundario(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		contato.setTelefoneTerciario(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		contato.setEmail(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		contato.setResponsavel(dataTemp.get(csvConfig.getNamesCols().get(i++)));

		endereco.setTipoDeEndereco(dataTemp.get(csvConfig.getNamesCols().get(i++)));
		
		List<Endereco> enderecos = new ArrayList<>();
		enderecos.add(endereco);
		
		customer.setEnderecos(enderecos);
		customer.setContato(contato);
		
		customer.setData(dataTemp);
		
		return customer;
	}
}
