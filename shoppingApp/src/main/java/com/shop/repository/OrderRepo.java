package com.shop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.OrderDetails;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetails, Integer>{

}
