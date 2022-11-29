package com.shop.service;

import com.shop.exception.PaymentException;
import com.shop.model.Payment;

public interface PaymentService {
	
	public Payment addNewPayment(Payment payment)throws PaymentException;
	
	public Payment updatePayment(Payment payment,Integer id)throws PaymentException;
	
	public Payment deletePayment(Integer id)throws PaymentException;
	
	public Payment getPaymentById(Integer id)throws PaymentException;

}
