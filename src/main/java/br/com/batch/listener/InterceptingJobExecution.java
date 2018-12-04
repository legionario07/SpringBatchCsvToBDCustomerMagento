package br.com.batch.listener;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.batch.databases.repository.CustomerEntityGridFlatRepository;
import br.com.batch.databases.repository.DirectoryCountryRegionRepository;
import br.com.batch.model.Customer;
import br.com.batch.model.CustomerEntityGridFlat;
import br.com.batch.model.DirectoryCountryRegion;
import br.com.batch.model.enums.CreateInType;
import br.com.batch.utils.SessionUtil;

@Component
public class InterceptingJobExecution implements JobExecutionListener {

	private static final Logger logger = LoggerFactory.getLogger(InterceptingJobExecution.class);

	@Autowired
	private DirectoryCountryRegionRepository directoryCountryRegionRepository;

	@Autowired
	private CustomerEntityGridFlatRepository customerEntityFlatRepository;

	@Override
	public void beforeJob(JobExecution jobExecution) {

		// Carregando os dados de EavAttributes
		Iterable<DirectoryCountryRegion> listDirectory = directoryCountryRegionRepository.findAll();
		Map<String, DirectoryCountryRegion> mapCountryRegion = new HashMap<>();
		for (DirectoryCountryRegion e : listDirectory) {
			mapCountryRegion.put(e.getCode(), e);
		}
		SessionUtil.getInstance().setMapCountryRegion(mapCountryRegion);

		logger.info("Iniciando JobExecutionListener");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {

		
		logger.info("Total de Customers Inseridos: {}",
				jobExecution.getStepExecutions().iterator().next().getReadCount());

		logger.info("Finalizado");
	}

}
