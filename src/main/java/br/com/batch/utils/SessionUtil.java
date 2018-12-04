package br.com.batch.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.batch.model.Customer;
import br.com.batch.model.DirectoryCountryRegion;

public class SessionUtil {

	private static SessionUtil instance = null;
	private List<Customer> customers;
	
	private Map<String, DirectoryCountryRegion> mapCountryRegion;
	
	private SessionUtil() {
		mapCountryRegion = new HashMap<>();
		customers = new ArrayList<>();
	}

	public static SessionUtil getInstance() {
		if(instance == null) {
			instance = new SessionUtil();
		}
		
		return instance;
	}

	
	public Map<String, DirectoryCountryRegion> getMapCountryRegion() {
		return mapCountryRegion;
	}

	public void setMapCountryRegion(Map<String, DirectoryCountryRegion> mapCountryRegion) {
		this.mapCountryRegion = mapCountryRegion;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
