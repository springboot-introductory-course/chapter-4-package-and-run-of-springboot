package com.purvar.springboot.demo2.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="user")
public class User {
	private int age;
	
	private String name;
	
	private String userName;
	
	private String userName2;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName2() {
		return userName2;
	}

	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}
	
	@Override
	public String toString() {
		String format = "name=%s,age=%s,userName=%s,userName2=%s";
		return String.format(format, name, age, userName, userName2);
	}
}
