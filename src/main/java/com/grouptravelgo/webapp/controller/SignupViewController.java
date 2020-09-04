package com.grouptravelgo.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grouptravelgo.webapp.UserSignupInfo;

@Controller
@RequestMapping("/signup")
public class SignupViewController {
	
	@RequestMapping(value="signupview", method=RequestMethod.GET)
	public String signupView()
	{
		System.out.println(">>	SignupViewController->signupView()");
		
		return "/signup/signupview.html";
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST) 
	public ModelAndView signup(UserSignupInfo user) 
	{
		System.out.println(">>	SignupViewController->signup()");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup/signupsuccessview.html");
		modelAndView.addObject("user", user.getLogin());
		
		return modelAndView;
	}
}
