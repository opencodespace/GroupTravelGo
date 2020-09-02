package com.grouptravelgo.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= {"/login"})
public class LoginViewController {

	@RequestMapping("/loginview")
	public String loginView()
	{
		System.out.println(">>	LoginViewController->loginView()");
		return "login/loginview.html";
	}
}
