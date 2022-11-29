package com.shop.service;

import com.shop.exception.CartException;
import com.shop.model.Cart;

public interface CartService {
	
	public Cart addNewCart(Cart cart)throws CartException;
	
	public Cart updateCart(Integer id,Cart cart)throws CartException;
	
	public Cart deleteCart(Integer id)throws CartException;
	
	public Cart getCartById(Integer id)throws CartException;

}
