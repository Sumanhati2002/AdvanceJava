package com.spring.epl;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Main;
import com.spring.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/contact")
	public String show() {
		
		return "contact";
	}
	
	//using @modelattribute
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handler(@ModelAttribute Main main, Model model) {
		
		System.out.println(main);
		
		model.addAttribute("user", main);
		this.userservice.createUser(main);
		return"result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//using @requestparam annotation
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handler(
			@RequestParam("email") String email,
			@RequestParam("name") String name, @RequestParam("password") int pw,Model model){
		
		Main user=new Main();
		
		user.setEmail(email);
		user.setName(name);
		user.setPassword(pw);
		
		System.out.println(user);
		
		model.addAttribute("user",user);
//	   model.addAttribute("email", email);
//	   model.addAttribute("name", name);
//	   model.addAttribute("password", pw);
//	   
		return "result";
		
	}
	*/
}
