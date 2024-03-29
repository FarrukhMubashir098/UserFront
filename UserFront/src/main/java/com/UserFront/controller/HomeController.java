package com.UserFront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.UserFront.domain.User;
import com.UserFront.service.UserServiceImplementation.UserServiceImpl;

@Controller
public class HomeController {
	
@Autowired
private UserServiceImpl userService;

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
public String signupPost(@ModelAttribute("user") User user , Model model) {
	
	if(userService.checkUserExist(user.getUserName(), user.getEmail())) {
		
		if(userService.checkUsernameExist(user.getUserName())) {
			model.addAttribute("usernameExists", true);
		}
		
		if(userService.checkEmailExist(user.getEmail())) {
			model.addAttribute("emailExists", true);
		}
		
		return "signup";
	}
	
	else {
		
		userService.save(user);
		return "redirect:/";
	}
	
	
	
}  

	
	
}  
