package com.tom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIntoLoginPage(ModelMap model,HttpServletRequest req) {
		
		req.getSession().setAttribute("logInStatus","init");
		
		return "Login";
	}
	
	@RequestMapping(value = "/Login.do", method = RequestMethod.POST)
	public ModelAndView logInSub(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpServletRequest req) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		if(checkUserCredential(username,password)) {
			req.getSession().setAttribute("logInStatus","true");
			modelAndView.setViewName("Success");
			modelAndView.addObject("userName", username);
		}
		else {
			req.getSession().setAttribute("logInStatus","false");
			modelAndView.setViewName("Login");
		}
		
		return modelAndView;
		
	}
	
	private boolean checkUserCredential(String username, String password) {
	
		if(username.toUpperCase().equals("TOM") && password.equals("123")) {
			return true;
		}
		
		return false;
	}
	
	
	
}
