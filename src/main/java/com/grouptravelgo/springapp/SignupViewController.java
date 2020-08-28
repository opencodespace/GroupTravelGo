package com.grouptravelgo.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(value= "signup")
public class SignupViewController {
	
	//@Autowired
	UserSignupInfo userInfo;
	
	//@RequestMapping(value="/signup", method=RequestMethod.POST)
	@RequestMapping(value="signupview", method=RequestMethod.GET)
	public String signupView()
	{
		System.out.println(">>	SignupViewController->signupView()");
		System.out.println(">>	method=RequestMethod.GET");
		
		return "signupview.html";
	}
	
	//@RequestMapping(value="signup", 		method=RequestMethod.POST)
	//@RequestMapping(value= "signup", method=RequestMethod.GET)
	//@PostMapping(value= "signup")
	@RequestMapping(
		    value = "signup",
		    method = RequestMethod.POST,
		    headers="Accept=application/x-www-form-urlencoded")
	public @ResponseBody String signup(@RequestBody String req)
	{
		System.out.println(">>	SignupViewController->signup()");
		System.out.println(">>	method=RequestMethod.POST");
		
		return "signupsuccessview.html";
		//return "Success";
	}
	

}
