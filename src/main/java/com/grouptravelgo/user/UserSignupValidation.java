package com.grouptravelgo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouptravelgo.common.Result;

@Service
public class UserSignupValidation {
	
	public static final String ErrLoginExists = "Login already exists in the DB.";
	public static final String ErrEmailExists = "Email already exists in the DB.";
	public static final String MsgRegSuccess = "Registration Successful.";
	
	@Autowired
	UserRepository usrRepo;
	
	public Result insertUser(UserSignupInfo user)
	{
		Result result = null;
		List<UserSignupInfo> users = null;
		
		System.out.println("Login :" + user.getLogin());
		
		users = usrRepo.findByLogin(user.getLogin());
		
		if((users != null ) && !users.isEmpty())
		{
			/*
			System.out.println("Printing results:");
			Iterator<UserSignupInfo> it = users.iterator();
			while(it.hasNext())
			{
				UserSignupInfo obj = it.next();
				if(obj != null)
				{
					System.out.println("obj.getLogin(): " +obj.getLogin());
				}
				System.out.println("[Object]: "+ obj.toString());
			}
			*/
			
			result = new Result(Result.FAILED, UserSignupValidation.ErrLoginExists);
			return result;
		}
		
		System.out.println("Email: " + user.getEmail());
		users = usrRepo.findByEmail(user.getEmail());
		
		if((users != null) && !users.isEmpty())
		{
			result = new Result(Result.FAILED, UserSignupValidation.ErrEmailExists);
			return result;
		}
		
		usrRepo.insert(user);
		
		result = new Result(Result.SUCCESS, UserSignupValidation.MsgRegSuccess);

		return result;
	}

}
