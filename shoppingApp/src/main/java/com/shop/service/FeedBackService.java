package com.shop.service;

import java.util.List;

import com.shop.exception.FeedBackException;
import com.shop.model.FeedBack;

public interface FeedBackService {
	
	public List<FeedBack> getAllFeedBack()throws FeedBackException;
	
	public FeedBack addFeedBack(FeedBack feedBack)throws FeedBackException;
	
	public FeedBack updateFeedBack(FeedBack feedBack,Integer id)throws FeedBackException;
	
	public FeedBack deleteFeedBack(Integer id)throws FeedBackException;
	
	public FeedBack getFeedBackById(Integer id)throws FeedBackException;

}
