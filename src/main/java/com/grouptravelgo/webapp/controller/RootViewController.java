package com.grouptravelgo.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootViewController {

	@RequestMapping("/")
	public String indexView()
	{
		System.out.println(">>	RootViewController->indexView()");
		return "index.html";
	}
}
