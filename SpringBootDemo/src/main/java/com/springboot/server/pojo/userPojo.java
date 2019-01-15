package com.springboot.server.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserDB")
public class userPojo {
	
@Id	
String userId;
String password;
public userPojo(String userId, String password) {
	super();
	this.userId = userId;
	this.password = password;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "userPojo [userId=" + userId + ", password=" + password + "]";
}	
}
