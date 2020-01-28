package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Institute;
import com.lti.model.Student;
@Repository
public class InstituteDaoImpl implements InstituteDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public int createInstitute(Institute institute) {
		entityManager.persist(institute);
		return 1;
	}

	@Override
	public Institute loginInstitute(int instituteCode, String setPassword) {
		String jpql="Select i from Institute  i where i.instituteCode=:instituteCode ";
		TypedQuery<Institute> typedquery=entityManager.createQuery(jpql,Institute.class);
		typedquery.setParameter("instituteCode", instituteCode);
		Institute institute=null;
		
		//typedquery.setParameter("setPassword", setPassword);
		institute =typedquery.getSingleResult();
		int code=institute.getInstituteCode();
		//String pass=institute.getSetPassword();
		return institute;
	}

	@Override
	public Student loginStudent(long aadharNo, String password) {
		String jpql="Select s from Student s where s.aadharNo=:aadharNo ";
		TypedQuery<Student> typedquery=entityManager.createQuery(jpql,Student.class);
		typedquery.setParameter("aadharNo", aadharNo);
		Student student=null;
		
		student =typedquery.getSingleResult();
		long code=student.getAadharNo();
		return student;
		
		
	
	}
	
	

	
}
