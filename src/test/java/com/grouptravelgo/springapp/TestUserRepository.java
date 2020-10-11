package com.grouptravelgo.springapp;

import com.grouptravelgo.webapp.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GroupTravelGoApplication.class)	
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
		
		UserSignupInfo user = new UserSignupInfo("Tom123", "Tom@123", "tom@gmail.com", "Tom", "Lugar");
		UserSignupInfo user1 = new UserSignupInfo("Tom123", "Tom@123", "tom@gmail.com", "Tom", "Lugar");
		
		try {
			//usrRepo.insert(user);
			//usrRepo.insert(user1);
			Result result;
			result = userDbIntf.insertUser(user1);
			System.out.println("user result" + result.toString());
			result = userDbIntf.insertUser(user1);
			System.out.println("user1 result" + result.toString());
		} 
		catch(Exception e)
		{
			e.printStackTrace();
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
	
	//@Test
	@Order(1)
	void deleteAll()
	{
		System.out.println("\n\n======== TestUserRepository::deleteAll() ===========\n\n");
		usrRepo.deleteAll();
	}

}
