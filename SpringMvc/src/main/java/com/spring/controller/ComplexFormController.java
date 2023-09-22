package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Main;

@Controller
public class ComplexFormController {

	@RequestMapping("/complexform")
	public String showForm() {
		
		return "complex-form";
	}
	
	@RequestMapping(path = "/complex",method = RequestMethod.POST)
	public String handler(@ModelAttribute("main") Main main,BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "complex-form";
		}
		System.out.println(main);
		return "success";
	}
}
