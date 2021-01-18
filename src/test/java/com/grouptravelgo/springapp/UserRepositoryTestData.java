package com.grouptravelgo.springapp;

import java.util.ArrayList;

import com.grouptravelgo.user.UserSignupInfo;



public class UserRepositoryTestData {
	
	public static ArrayList<UserSignupInfo> getTestUsers()
	{
		ArrayList<UserSignupInfo> users = new ArrayList<UserSignupInfo>();
		
		for(int i=0; i < testUsers.length; i++)
		{
			users.add(new UserSignupInfo(testUsers[i][0], 
										testUsers[i][1], 
										testUsers[i][2],
										testUsers[i][3],
										testUsers[i][4]) );
		}
		
		return users;
	}
	
	static String testUsers[][] = {
			{"tom", "tom@123", "tom@test123.com", "Tom", "Lugar"},
			{"sam", "sam@123", "sam@test123.com", "Samuel", "Monty"},
			{"micky", "micky@123", "micky@test123.com", "Micky", "Jason"},
			{"casey", "casey@123", "casey@test123.com", "Casey", "Sting"},
			{"carol", "carol@123", "carol@test123.com", "Carol", "Stone"},
			{"frazer", "frazer@123", "frazer@test123.com", "Frazer", "Micheal"}
		};

}
