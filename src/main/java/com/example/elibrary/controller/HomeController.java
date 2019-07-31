package com.example.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//@RequestMapping(value = "/", method= RequestMethod.GET)
	@GetMapping(value = {"/", "/home"})
	public String displayHomePage() {
		return "home/index";
	}
	
	@GetMapping(value = "/aboutus")
	public String displayAboutUsPage() {
		return "home/aboutus";
	}
}
