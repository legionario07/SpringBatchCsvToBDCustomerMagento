package br.com.batch.writers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import br.com.batch.model.Customer;

@Component
public class SaveCustomerJdbcBatchItemWriter implements ItemWriter<Customer> {

	public static final Logger logger = LoggerFactory.getLogger(SaveCustomerJdbcBatchItemWriter.class);
	

	@Override
	public void write(List<? extends Customer> items) throws Exception {
		
		
		
	}
	
}
