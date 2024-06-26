package com.kalhari.springboot.myfirstwebapplication.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	// private Logger logger = LoggerFactory.getLogger(this.getClass());
	// logger.info("postConstruct")
	
	// /login => com.kalhari.springboot.myfirstwebapplication.login.LoginController => login.jsp
	// http://localhost:8080/login?name=Kalhari
	// Model
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Request param is {} ", name);
		logger.info("I want this printed at info level");
		logger.warn("I want this printed at warn level");
		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION CODE
		return "login";
	}
}
