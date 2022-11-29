package com.shop.service;

import com.shop.exception.OrderException;
import com.shop.model.OrderDetails;

public interface OrderService{
	
	public OrderDetails addOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails updateOrder(OrderDetails order,Integer id)throws OrderException;
	
	public OrderDetails deleteOrder(Integer id)throws OrderException;
	
	public OrderDetails getOrderByOrderId(Integer id)throws OrderException;

}
