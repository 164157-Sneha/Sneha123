package com.springboot.server.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.server.pojo.userPojo;

public interface LoginController extends MongoRepository<userPojo, String> {
	

}
