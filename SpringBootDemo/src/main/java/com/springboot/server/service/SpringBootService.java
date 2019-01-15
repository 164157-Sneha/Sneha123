package com.springboot.server.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.server.pojo.userPojo;

@RestController
public class SpringBootService {

	LoginController login;
	
	/*
	 * @RequestMapping(method= RequestMethod.POST, value="api/user") public boolean
	 * ValidateUser(String Username, String password) {
	 * if(login.findById(Username).equals(Username) &&
	 * login.findById(password).equals(password)) { return true; } return false; }
	 */
	
	@RequestMapping(method= RequestMethod.POST, value="api/adduser")
	public void addUser(@RequestBody userPojo  user)
	{
		login.save(user);
	
	}
	
	@RequestMapping(method= RequestMethod.GET, value="api/getuser")
	public  void getUser() {
		login.findAll();
	}
}
