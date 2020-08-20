package com.grouptravelgo.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String indexPageView()
	{
		System.out.println(">>>  indexPageView()");
		return "/index.html";
	}
}
