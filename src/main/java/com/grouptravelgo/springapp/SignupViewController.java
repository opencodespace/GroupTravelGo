package com.grouptravelgo.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
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
		
		return "signup/signupview.html";
	}
	

	//@RequestMapping(
	//	    value = "signup",
	//	    method = RequestMethod.POST,
	//	    consumes = {MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	//	    produces = {MediaType.TEXT_HTML, MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	//	    )
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	//@ResponseBody
	public String signup() {
	    //return "signupsuccessview.html";
		System.out.println(">>	*** SignupViewController->signup()");
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("/signup/signupview");
	    //return modelAndView;
		//return "redirect:/signup/signupsuccessview.html";
	    return "signup/signupsuccessview.html";
	}
	

}
