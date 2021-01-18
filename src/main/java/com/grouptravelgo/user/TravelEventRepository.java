package com.grouptravelgo.user;

import java.sql.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelEventRepository extends MongoRepository<TravelEvent, String>{
	
	public List<TravelEvent> findByLogin(String login);
	public List<TravelEvent> findByStart(String start);
	public List<TravelEvent> findByEventName(String eventName);
	public List<TravelEvent> findByLocation(String location);
	public List<TravelEvent> findByEventNameAndStart(String eventName, Date start);
	public List<TravelEvent> findAll();
}
