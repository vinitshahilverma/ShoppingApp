package com.shop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sellerId;
	private String sellerName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "seller")
	private List<Product> productList = new ArrayList<>();

}
