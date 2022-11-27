package com.shop.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private LocalDate orderDate;
	private String orderStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address shippingAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;
	
	private double total_Amount;
	
	@JsonIgnore
	@OneToOne
	private FeedBack feedback;

}
