package com.grouptravelgo.webapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/userviews")
public class UserViewController {
	
	@RequestMapping(value="homeview", method=RequestMethod.GET)
	public ModelAndView homeView(HttpSession session)
	{
		System.out.println(">>	UserViewController->homeView()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/userviews/homeview.html");
		
		System.out.println("session value :" +  session.getAttribute("login"));
		
		modelAndView.addObject("login", session.getAttribute("login"));
		
		return modelAndView;
	}

}
