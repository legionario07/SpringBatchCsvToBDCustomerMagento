package br.com.batch.databases;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.batch.configuration.CsvConfig;
import br.com.batch.model.Customer;

@Component
public class CustomerItemPreparedStatementSetter {

	@Autowired
	CsvConfig csvConfig;
	
	@Bean
	public ItemPreparedStatementSetter<Customer> getSetter() {
	    
		return new ItemPreparedStatementSetter<Customer>() {
			
			@Override
			public void setValues(Customer item, PreparedStatement ps) throws SQLException {
				int i = 1;
				List<String> namesCols = csvConfig.getNamesCols();
				for(String s : namesCols) {
					ps.setString(i++,item.getData().get(s));
				}
			}
		};
	 }
}
