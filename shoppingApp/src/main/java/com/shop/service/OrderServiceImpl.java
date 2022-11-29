package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.exception.OrderException;
import com.shop.model.OrderDetails;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public OrderDetails addOrder(OrderDetails order) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order, Integer id) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails deleteOrder(Integer id) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails getOrderByOrderId(Integer id) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
