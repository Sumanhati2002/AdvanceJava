package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hiii")
	public String show(Model model) {
		
		String msgString="hello spring";
		System.out.println();
		model.addAttribute("msg",msgString);
		return "hello";
	}
	
}
