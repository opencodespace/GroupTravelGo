package com.grouptravelgo.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginViewController {

	@RequestMapping("loginview")
	public String loginView()
	{
		System.out.println(">>	LoginViewController->loginView()");
		return "login/loginview.html";
	}
}
