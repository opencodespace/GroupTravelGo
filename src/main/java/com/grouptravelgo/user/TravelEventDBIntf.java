package com.grouptravelgo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouptravelgo.common.Result;

@Service
public class TravelEventDBIntf {
	
	@Autowired
	TravelEventRepository travelEventRepo;
	
	public Result insertUser(TravelEvent event)
	{
		Result result = null;
		List<TravelEvent> events = null;	
		
		return result;
	}

}
