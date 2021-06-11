package com.grouptravelgo.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travelevent")
public class TravelEvent {
    @Id
    private String id;
    @Indexed(unique=true)
	private String login;
    private java.sql.Date start;
    private java.sql.Date end;
    private String eventName;
    private String location;
    private String eventDescription;
    private int isVisible;
    
    public TravelEvent(String login, Date start, Date end, String eventName,
    		String eventDescription, int isVisible)
    {
    	this.login 		= login;
    	this.start 		= start;
    	this.end 		= end;
    	this.eventName	= eventName;
    	this.eventDescription = eventDescription;
    	this.isVisible	= isVisible;
    }
    
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
    
    public String getLogin() {
    	return login;
    }
    
    public void setLogin(String login) {
    	this.login = login;
    }
    
    public Date getStart() {
    	return start;
    }
    
    public void setLogin(Date start) {
    	this.start = start;
    }
 
    public Date getEnd() {
    	return end;
    }
    
    public void setEnd(Date end) {
    	this.end = end;
    }
    
    public String getEventName() {
    	return eventName;
    }
    
    public void setEventName(String eventName) {
    	this.eventName = eventName;
    }
    
    public String getLocation() {
    	return location;
    }
    
    public void setLocation(String location) {
    	this.location = location;
    }
    
    public String getEventDescription() {
    	return eventDescription;
    }
    
    public void setEventDescription(String eventDescription) {
    	this.eventDescription = eventDescription;
    }    

    public int getIsVisible() {
    	return isVisible;
    }
    
    public void setIsVisible(int isVisible) {
    	this.isVisible = isVisible;
    }
    
	@Override
	public String toString() {
		/*
	    StringBuilder str = new StringBuilder();
	    str.append("Id:- " + getId() + ", Login:- " + getLogin() + ", Start:- " + getStart() + 
	    		", End:- " + getEnd() + ", EventName:- " + getEventName() + ", Location:- " + getLocation() +
	    		getEventName() + ", EventDescription:- " + getEventDescription() + ", IsVisible:- " + getIsVisible());
	    return str.toString();
	    */
		
		return "Hellow";
	}
    
}
