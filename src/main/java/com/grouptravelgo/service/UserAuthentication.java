package com.grouptravelgo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouptravelgo.common.Result;
import com.grouptravelgo.dal.mongo.UserRepository;
import com.grouptravelgo.entity.UserSignupInfo;

@Service
public class UserAuthentication {
	
	@Autowired
	UserRepository usrRepo;
	
	public Result authenticateUser(String login, String pwd)
	{
		Result result = null;
		List<UserSignupInfo> users = null;
		
		System.out.println("login: "+ login + " pwd: " + pwd);
		
		users = usrRepo.findByLoginAndPsw(login, pwd);
		
		if((users != null ) && !users.isEmpty())
		{
			System.out.println("1111111111");
			result = new Result(Result.SUCCESS, "");
		}
		else
		{
			System.out.println("22222222");			
			result = new Result(Result.FAILED, "* Invalid login or password.");
		}
		
		return result;
	}
}
