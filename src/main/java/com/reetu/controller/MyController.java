package com.reetu.controller;

import org.springframework.security.core.Authentication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	
	@RequestMapping("/demo1")
	public String demo(Authentication authentication,Model m) {
		m.addAttribute("name", authentication.getName());
		return "demo1";
	}

	@RequestMapping("/demo2")
	public String Demotwo(Authentication authentication, Model model) {
		model.addAttribute("name", authentication.getName());
		return "demo2";
		
	}
	
	@RequestMapping("/accessDenied")
	public String accessdenied() {
		return "accessdenied";
	}

}
