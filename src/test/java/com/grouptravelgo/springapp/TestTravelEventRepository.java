package com.grouptravelgo.springapp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.grouptravelgo.dal.mongo.TravelEventRepository;
import com.grouptravelgo.entity.TravelEvent;
import com.grouptravelgo.webapp.GroupTravelGoApplication;

@SpringBootTest(classes = GroupTravelGoApplication.class)
@TestMethodOrder(OrderAnnotation.class) 
public class TestTravelEventRepository {
	
	@Autowired
	TravelEventRepository taRepo;
	
	@Test
	@Order(1)
	void deleteAll()
	{
		System.out.println("\n\n======== TestTravelEventRepository::deleteAll() ===========\n\n");
		taRepo.deleteAll();
	}

	@Test
	@Order(2)
	void insertTravelEvents()
	{
		System.out.println("\n\n======== TestTravelEventRepository::insertTravelEvents() ===========\n\n");
		
		ArrayList<TravelEvent> ta = TARepositoryTestData.getTestEvents();
		
		Iterator<TravelEvent> iterator = ta.iterator();
		
        while (iterator.hasNext()) { 
        	TravelEvent taObj = iterator.next();
        	
    		try {
    			//Result result;
    			taRepo.insert(taObj);
    			//System.out.println("TestEvent result" + result.toString());
    		} 
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
        } 
	}
	
	@Test
	@Order(3)
	void displayAllTravelEvents()
	{
		System.out.println("\n\n======== TestTravelEventRepository::displayAllTravelEvents() ===========\n\n");
		
		List<TravelEvent> ta = taRepo.findAll();
		
		Iterator iterator = ta.iterator();
		
		while(iterator.hasNext()) {
	         //System.out.println(((TravelEvent)iterator.next()).toString());
			TravelEvent taobj = (TravelEvent)iterator.next();
		}
	}	
	
}


class TARepositoryTestData {
	
	public static ArrayList<TravelEvent> getTestEvents()
	{
		ArrayList<TravelEvent> ta = new ArrayList<TravelEvent>();
		
		for(int i=0; i < testTravelEvents.length; i++)
		{
			TravelEvent obj = new TravelEvent( testTravelEvents[i][0],
								Date.valueOf(testTravelEvents[i][1]),
								Date.valueOf(testTravelEvents[i][2]),
								testTravelEvents[i][3],
								testTravelEvents[i][4],
								Integer.parseInt(testTravelEvents[i][5])
								);
			ta.add(obj);
		}
		
		return ta;
	}
	
	static String testTravelEvents[][] = {
			{"tom", "2021-09-03", "2021-09-10", "ManaliTrip", "Vacation trip to Manali.", "1"},
			{"sam", "2021-12-25", "2022-01-02", "GoaTrip", "Year end vacation", "1"},
			{"micky", "2021-10-02", "2021-10-07", "HimalayanTrip", "Adventure, white water rafting", "1"},
			{"casey", "2021-04-25", "2021-04-30", "CoorgTrip", "Wild life and bird watching", "1"},
			{"carol", "2021-06-20", "2021-06-27", "KeralaTrip", "Back waters", "1"},
			{"frazer", "2021-11-25", "2022-11-30", "Santorini", "Greek vacation !!!", "1"},
		};	
	
}