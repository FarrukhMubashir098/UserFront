package com.UserFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.UserFront.domain.User;

@Controller
public class HomeController {

@RequestMapping("/")	
	public String home() {
		return "redirect:/index";
	}
@RequestMapping("/index")	
	public String index() {
		return "index";
	} 

@RequestMapping(value="/signup" , method=RequestMethod.GET)
	public String signupGet(Model model) {
		User user = new User();
		
		model.addAttribute("user", user);
		return "signup";
	}

@RequestMapping(value="/signup" , method=RequestMethod.POST)
public void signupPost(@ModelAttribute("user") User user , Model model) {
	
	
	
}  

	
	
}  
