package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.dao.UserDao;
import com.spring.service.UserService;


@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDao userdao;
	
	//to show the contact form
		@RequestMapping("/")
		public String showForm() {
			
			return "contact";	
		}
	
		//to show all data from db
	@RequestMapping("/contact")
	public String show(Model m) {
		List<com.spring.model.User> users=userdao.getUser();
		m.addAttribute("users",users);
		return "index";
	}
	
	
	/*
	 * @RequestMapping(path = "/processform",method = RequestMethod.POST) public
	 * String home(@ModelAttribute("user")com.spring.model.User user,Model model) {
	 * 
	 * System.out.println("user"+user);
	 * 
	 * this.userService.createUser(user);
	 * 
	 * return "success"; }
	 */
	
	//handler to add user
	@RequestMapping(value = "/processform",method = RequestMethod.POST)
	public RedirectView handleUser(@ModelAttribute com.spring.model.User user,HttpServletRequest request) {
		
		this.userdao.saveUser(user);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath() +"/");
		return redirectView;	
	}
	
	//handler to delete the user
	@RequestMapping("/delete/{id}")
	public RedirectView deleteUser(@PathVariable("id") int id,HttpServletRequest request) {
		
		this.userdao.deleteUser(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath() +"/");

		return redirectView;
		
	}
	
	//update user
	@RequestMapping("update/{id }")
	public String updateUser(@PathVariable("id") int id,Model model) {
		
		com.spring.model.User user=this.userdao.getUser(id);
		model.addAttribute("user",user);
		return "updateuser";
	}
	}










