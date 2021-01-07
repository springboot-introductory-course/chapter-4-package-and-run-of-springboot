package com.purvar.springboot.demo2.controller;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purvar.springboot.demo2.dto.User;

@RestController
@RequestMapping("/yml")
public class YmlTestController {
	
	@Value("${myName}")
	private String myName;
	
	@Value("${myname}")
	private String myname;
	
	@Autowired
	private User user;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/name")
	public String getName() {
		return "myName=" + myName + "; myname=" + myname;
	}
	
	@RequestMapping("/user")
	public String getUser() {
		return user.toString();
	}
	
	@RequestMapping("/sys")
	public String getSys() {
		//Properties pro = System.getProperties();
		return env.getProperty("user.age");
	}

}
