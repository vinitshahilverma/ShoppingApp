package com.shop.service;

import java.util.List;

import com.shop.exception.ProductException;
import com.shop.model.Product;

public interface ProductService {
	
	public List<Product> getAllTheProduct()throws ProductException;
	
	public Product getProductById(Integer id)throws ProductException;
	
	public Product addProduct(Product product)throws ProductException;
	
	public Product deleteProduct(Integer id)throws ProductException;
	
	public Product updateProduct(Product product,Integer id)throws ProductException;

}
