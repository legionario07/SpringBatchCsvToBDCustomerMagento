package br.com.batch.readers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import br.com.batch.configuration.CsvConfig;
import br.com.batch.model.Customer;

@Component
public class CustomerItemFlatFileReader {

	private static final Logger logger = LoggerFactory.getLogger(CustomerItemFlatFileReader.class);
	
	@Autowired
	CsvConfig csvConfig;
	
	@Bean
	public FlatFileItemReader<Customer> getSaveItemFlatFileReader(){
		
		logger.info("INICIANDO READER");
		
		//String names[] = csvConfig.get
	
		FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>();
		reader.setEncoding("UTF-8");
		reader.setResource(new FileSystemResource(csvConfig.getNameFile()));
		reader.setLineMapper(new DefaultLineMapper<Customer>() {{
			setLineTokenizer(new DelimitedLineTokenizer(csvConfig.getSplit()) {{
				setNames((String[]) csvConfig.getNamesColsToArray());
			}});
			setFieldSetMapper(new CustomerItemFieldSetMapper(csvConfig));
		}});
		return reader;
	}
	
}
