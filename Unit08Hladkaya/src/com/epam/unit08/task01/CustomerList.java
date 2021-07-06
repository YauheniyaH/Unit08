package com.epam.unit08.task01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public CustomerList() {
		this.customers = new ArrayList<Customer>();
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

	public Customer getCustomer(int i) {
		return customers.get(i);

	}

	public List<Customer> findByCardNumber (long startPoint, long finishPoint){
		List<Customer> result= new ArrayList<Customer>();
		
		for(Customer c: customers) {
			if(c.getCardNumber()>=startPoint & c.getCardNumber()<=finishPoint) {
				result.add(c);
			}
		}
				
		return result;
	}
	
	
	public void sortCustomers () {
		customers.sort(new NameSorter());
	}
	
	public int size() {
		return customers.size();
	}

}
