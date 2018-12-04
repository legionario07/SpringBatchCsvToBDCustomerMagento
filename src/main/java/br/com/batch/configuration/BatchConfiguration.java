package br.com.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.batch.listener.InterceptingJobExecution;
import br.com.batch.model.Customer;
import br.com.batch.processor.SaveItemCustomerProcessor;
import br.com.batch.readers.CustomerItemFieldSetMapper;
import br.com.batch.readers.CustomerItemFlatFileReader;
import br.com.batch.writers.SaveCustomerJdbcBatchItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	CustomerItemFieldSetMapper saveItemFieldSetMapper;
	
	@Autowired
	CustomerItemFlatFileReader saveItemFlatFileReader;
	
	@Autowired
	SaveCustomerJdbcBatchItemWriter saveJdbcBatchItemWriter;
	
	@Autowired
	SaveItemCustomerProcessor saveItemProcessor;
	
	@Autowired
	InterceptingJobExecution interceptingJobExecution;


	
	@Bean
	public Step step1() {
		System.out.println("STEP 1");
		return stepBuilderFactory.get("step1").<Customer,Customer>chunk(10)
				.reader(saveItemFlatFileReader.getSaveItemFlatFileReader())
				.processor(saveItemProcessor)
				.writer(saveJdbcBatchItemWriter)
				.build();
	}
	
	
	@Bean
	public Job exportSaveCsvJob() {
		return jobBuilderFactory.get("exportSaveCsvJob")
				.incrementer(new RunIdIncrementer())
				.flow(step1())
				//.next(step2())
				.end()
				.listener(interceptingJobExecution)
				.build();
				
	}
}

