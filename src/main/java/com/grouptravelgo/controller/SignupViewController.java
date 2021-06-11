package com.grouptravelgo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grouptravelgo.common.Result;
import com.grouptravelgo.entity.UserSignupInfo;
import com.grouptravelgo.service.UserSignupValidation;

@Controller
@RequestMapping("/signup")
public class SignupViewController {
	
	@Autowired
	UserSignupValidation userSignupBean;
	
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
		
		//UserSignupValidation userSignupBean = new UserSignupValidation();
		
		Result result = userSignupBean.insertUser(user);
		
		String userMsg = "" + user.getLogin() + result.getErrString();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup/signupsuccessview.html");
		//modelAndView.addObject("user", user.getLogin());
		modelAndView.addObject("msg", userMsg);
		
		return modelAndView;
	}
}
