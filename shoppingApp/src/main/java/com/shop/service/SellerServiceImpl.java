package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.exception.SellerException;
import com.shop.model.Seller;

@Service
public class SellerServiceImpl implements SellerService{

	@Override
	public List<Seller> getAllSeller() throws SellerException {
		
		return null;
	}

	@Override
	public Seller addSeller(Seller seller) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller updateSeller(Seller seller, Integer id) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller getSellerById(Integer id) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller deleteSeller(Integer id) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
