package com.grouptravelgo.springapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.grouptravelgo.common.Result;
import com.grouptravelgo.dal.mongo.UserRepository;
import com.grouptravelgo.entity.UserSignupInfo;
import com.grouptravelgo.service.UserSignupValidation;
import com.grouptravelgo.webapp.GroupTravelGoApplication;

@SpringBootTest(classes = GroupTravelGoApplication.class)
@TestMethodOrder(OrderAnnotation.class) 
public class TestUserRepository {
	
	@Autowired
	UserRepository usrRepo;
	
	@Autowired
	UserSignupValidation userDbIntf;
	
	@Test
	@Order(2)
	void insertUsers()
	{
		System.out.println("\n\n======== TestUserRepository::insertUsers() ===========\n\n");
		
		ArrayList<UserSignupInfo> users = UserRepositoryTestData.getTestUsers();
		
		Iterator<UserSignupInfo> iterator = users.iterator();
		
        while (iterator.hasNext()) { 
        	UserSignupInfo userObj = iterator.next();
        	
    		try {
    			Result result;
    			result = userDbIntf.insertUser(userObj);
    			System.out.println("user result" + result.toString());
    		} 
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
        } 
	}
	
	@Test
	@Order(3)
	void displayAllUsers()
	{
		System.out.println("\n\n======== TestUserRepository::displayAllUsers() ===========\n\n");
		
		List<UserSignupInfo> users = usrRepo.findAll();
		
		Iterator iterator = users.iterator();
		
		while(iterator.hasNext()) {
	         System.out.println(iterator.next());
		}
	}
	
	@Test
	@Order(1)
	void deleteAll()
	{
		System.out.println("\n\n======== TestUserRepository::deleteAll() ===========\n\n");
		usrRepo.deleteAll();
	}
}
