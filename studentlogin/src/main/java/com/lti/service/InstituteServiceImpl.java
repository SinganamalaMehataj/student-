package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.InstituteDao;
import com.lti.model.Institute;
import com.lti.model.Student;
@Service("service")
public class InstituteServiceImpl implements InstituteService {
	@Autowired
	private InstituteDao dao;

	public InstituteDao getDao() {
		return dao;
	}

	public void setDao(InstituteDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addInstitute(Institute institute) {
		int result = dao.createInstitute(institute);
		if (result == 1)
			return true;
		else
			return false;
	}

	@Override
	public Institute loginInstitute(int instituteCode, String setPassword) {
		Institute result=dao.loginInstitute(instituteCode, setPassword);
		return result;
	}

	@Override
	public Student studentLogin(long aadharNo, String password) {
		Student result=dao.loginStudent(aadharNo, password);
		return result;
	}

}
