package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.exception.ProductException;
import com.shop.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getAllTheProduct() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(Integer id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product, Integer id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
