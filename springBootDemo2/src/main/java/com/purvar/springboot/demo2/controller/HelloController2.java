package com.purvar.springboot.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController2 {
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
