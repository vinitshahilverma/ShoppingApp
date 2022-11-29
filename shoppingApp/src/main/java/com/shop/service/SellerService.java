package com.shop.service;

import java.util.List;

import com.shop.exception.SellerException;
import com.shop.model.Seller;

public interface SellerService {
	
	public List<Seller> getAllSeller()throws SellerException;
	
	public Seller addSeller(Seller seller)throws SellerException;
	
	public Seller updateSeller(Seller seller,Integer id)throws SellerException;
	
	public Seller getSellerById(Integer id)throws SellerException;
	
	public Seller deleteSeller(Integer id)throws SellerException;
	

}
