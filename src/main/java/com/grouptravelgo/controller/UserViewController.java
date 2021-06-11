package com.grouptravelgo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/private/userviews")
public class UserViewController {
	
	@RequestMapping(value="homeview", method=RequestMethod.GET)
	public ModelAndView homeView(HttpSession session)
	{
		System.out.println(">>	UserViewController->homeView()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/private/userviews/homeview.html");
		
		System.out.println("session value :" +  session.getAttribute("login"));
		
		modelAndView.addObject("login", session.getAttribute("login"));
		
		return modelAndView;
	}
	
	@RequestMapping(value="createeventview", method=RequestMethod.GET)
	public ModelAndView createEventView(HttpSession session)
	{
		System.out.println(">>	UserViewController->createEventView()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/private/userviews/createeventview.html");
		
		System.out.println("session value :" +  session.getAttribute("login"));
		
		modelAndView.addObject("login", session.getAttribute("login"));
		
		return modelAndView;
	}

}
