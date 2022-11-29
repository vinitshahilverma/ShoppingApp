package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.exception.CustomerException;
import com.shop.model.Customer;

@Service
public class CustomrServiceImpl implements CustomerService{

	@Override
	public List<Customer> getAllCustomer() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(Integer id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(Integer id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer UpdateCustomer(Integer id, Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addNewCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
