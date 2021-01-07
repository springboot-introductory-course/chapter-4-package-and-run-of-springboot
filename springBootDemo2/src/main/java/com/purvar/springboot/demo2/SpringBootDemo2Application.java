package com.purvar.springboot.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.purvar.springboot.demo","com.purvar.springboot.demo2"})
//@RestController
public class SpringBootDemo2Application {

//	@RequestMapping("/enableAutoConfigurationTest")
//	public String test() {
//		return "Hello @EnableAutoConfiguration.";
//	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}

}
