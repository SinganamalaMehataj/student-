package com.lti.service;

import com.lti.model.Institute;
import com.lti.model.Student;

public interface InstituteService {
	public boolean addInstitute(Institute institute);
	public Institute loginInstitute(int instituteCode,String setPassword);
	public Student studentLogin(long aadharNo,String password);
}
