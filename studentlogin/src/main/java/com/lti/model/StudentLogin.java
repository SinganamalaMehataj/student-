package com.lti.model;

public class StudentLogin {

	private int aadharNo;
	private String password;
public StudentLogin() {
		super();
	}
public StudentLogin(int aadharNo, String password) {
	super();
	this.aadharNo = aadharNo;
	this.password = password;
}
public int getAadharNo() {
	return aadharNo;
}
public void setAadharNo(int aadharNo) {
	this.aadharNo = aadharNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}	
}

