package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.FeedBack;

@Repository
public interface FeedBackRepo extends JpaRepository<FeedBack, Integer>{

}
