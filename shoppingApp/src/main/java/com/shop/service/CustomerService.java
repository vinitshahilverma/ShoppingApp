package com.shop.service;

import java.util.List;

import com.shop.exception.CustomerException;
import com.shop.model.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomer()throws CustomerException;
	
	public Customer getCustomerById(Integer id)throws CustomerException;
	
	public Customer deleteCustomer(Integer id)throws CustomerException;
	
	public Customer UpdateCustomer(Integer id,Customer customer)throws CustomerException;
	
	public Customer addNewCustomer(Customer customer)throws CustomerException;

}
