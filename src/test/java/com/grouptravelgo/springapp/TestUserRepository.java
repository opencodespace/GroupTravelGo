package com.grouptravelgo.springapp;

import com.grouptravelgo.webapp.*;

import java.util.Iterator;
import java.util.List;

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
	
	@Test
	void insertUsers()
	{
		System.out.println("\n\n======== TestUserRepository::insertUsers() ===========\n\n");
		
		UserSignupInfo user = new UserSignupInfo("Tom123", "Tom@123", "tom@gmail.com", "Tom", "Lugar");
		usrRepo.insert(user);
	}
	
	@Test
	void displayAllUsers()
	{
		System.out.println("\n\n======== TestUserRepository::displayAllUsers() ===========\n\n");
		
		List<UserSignupInfo> users = usrRepo.findAll();
		
		Iterator iterator = users.iterator();
		
		while(iterator.hasNext()) {
	         System.out.println(iterator.next());
		}
		
	}

}
