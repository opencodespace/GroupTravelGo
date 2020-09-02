package com.grouptravelgo.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= {"/"})
public class ViewController {

	@RequestMapping("/")
	public String indexView()
	{
		System.out.println(">>	ViewController->indexView()");
		return "index.html";
	}
}
