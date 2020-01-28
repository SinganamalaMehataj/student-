package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Institute;
import com.lti.model.Student;
import com.lti.service.InstituteService;

@RestController
@RequestMapping(path = "login")
@CrossOrigin

public class StudentRestController {
	
	@Autowired
	private InstituteService service;
	
	@RequestMapping(path="{aadharNo}/{Password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student studentLogin(@PathVariable("aadharNo") long aadharNo,@PathVariable("Password") String Password) {
		
		Student student =  service.studentLogin(aadharNo, Password);
			
		return student;
	}

}
