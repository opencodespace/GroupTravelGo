package com.grouptravelgo.webapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.grouptravelgo.user.UserSignupInfo;

@Controller
@RequestMapping("/login")
public class LoginViewController {

	@RequestMapping("loginview")
	public String loginView()
	{
		System.out.println(">>	LoginViewController->loginView()");
		return "login/loginview.html";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST) 
	public RedirectView loginProcess(UserSignupInfo user, HttpSession session)
	{
		
		System.out.println(">>	LoginViewController->loginProcess()");
		
		System.out.println("Login:" + user.getLogin() + ", Pwd:" + user.getPsw());
		
		session.setAttribute("login", user.getLogin());
		
		System.out.println("session attribute:" + session.getAttribute("login"));
	
		return new RedirectView("http://localhost:8080/private/userviews/homeview");
	}
}
