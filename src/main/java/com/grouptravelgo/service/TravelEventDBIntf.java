package com.grouptravelgo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouptravelgo.common.Result;
import com.grouptravelgo.dal.mongo.TravelEventRepository;
import com.grouptravelgo.entity.TravelEvent;

@Service
public class TravelEventDBIntf {
	
	public static final String ErrEventExists = "Event for the given start date already exists in the DB.";
	public static final String MsgRegSuccess = "Event successfully inserted.";
	
	@Autowired
	TravelEventRepository travelEventRepo;
	
	public Result insertUser(TravelEvent event)
	{
		Result result = null;
		List<TravelEvent> events = null;

		// Check if the same even name and start date combination is present.
		// If the combination is present, do not insert. Same event should
		// be modified by the user.
		
		events = travelEventRepo.findByEventNameAndStart(event.getEventName(), event.getStart());
		
		if((events != null ) && !events.isEmpty())
		{
			result = new Result(Result.FAILED, TravelEventDBIntf.ErrEventExists);
			return result;			
		}
		
		travelEventRepo.insert(event);
		
		result = new Result(Result.SUCCESS, UserSignupValidation.MsgRegSuccess);

		return result;
	}
}
