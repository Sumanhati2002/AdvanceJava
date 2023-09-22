package com.spring.epl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String insert(Model model) {
		System.out.println("inserting....");
		
		model.addAttribute("name","suman");
		model.addAttribute("Id", 13232);
		
		//you can use list
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(240);
		
		model.addAttribute("marks", list);
		return "home";
	}
}
