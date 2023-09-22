package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name","suman");
		model.addAttribute("city","kolkata");
		model.addAttribute("id",2051);
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("this is help controller");
		ModelAndView mav=new ModelAndView();
		mav.addObject("name", "pratik");
		mav.addObject("id", 7654);
		
		mav.setViewName("help");
		return mav;
	}
}
