package com.grouptravelgo.webapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.grouptravelgo.common.MemberPrivileges;
import com.grouptravelgo.common.Result;
import com.grouptravelgo.user.UserAuthentication;
import com.grouptravelgo.user.UserSignupInfo;

@Controller
@RequestMapping("/login")
public class LoginViewController {
	
	@Autowired
	UserAuthentication usrAuth;
	/*
	@RequestMapping(value = "login", method = RequestMethod.POST) 
	public RedirectView loginProcess(UserSignupInfo user, HttpSession session)
	{
		System.out.println(">>	LoginViewController->loginProcess()");
		
		System.out.println("Login:" + user.getLogin() + ", Pwd:" + user.getPsw());
		
		session.setAttribute("login", user.getLogin());
		
		session.setAttribute("privilege", MemberPrivileges.PRIV_LVL_USER);
			
		return new RedirectView("http://localhost:8080/private/userviews/homeview");
	}
	*/
	
	@RequestMapping(value = "login", method = RequestMethod.POST) 
	public ModelAndView loginProcess(UserSignupInfo user, HttpSession session)
	{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(">>	LoginViewController->loginProcess()");
		
		Result result = usrAuth.authenticateUser(user.getLogin(), user.getPsw());
		
		if (result.result == Result.SUCCESS)
		{
				
			System.out.println("Login:" + user.getLogin() + ", Pwd:" + user.getPsw());
			
			session.setAttribute("login", user.getLogin());
			
			session.setAttribute("privilege", MemberPrivileges.PRIV_LVL_USER);
			
			modelAndView.setViewName("redirect:/private/userviews/homeview");
		}
		else
		{
			System.out.println("result err str:" + result.getErrString());
			modelAndView.addObject("ErrMsg", result.getErrString());
			modelAndView.setViewName("/index.html");
		}
			
		return modelAndView;
	}	
}
