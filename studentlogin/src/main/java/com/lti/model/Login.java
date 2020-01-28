package com.lti.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Login {
	private int instituteCode;
	private String password;

	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int instituteCode, String password) {
		super();
		this.instituteCode = instituteCode;
		this.password = password;
	}
	public int getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [instituteCode=" + instituteCode + ", password=" + password + "]";
	}
	
}
