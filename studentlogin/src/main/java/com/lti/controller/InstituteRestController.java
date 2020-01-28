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
@RequestMapping(path = "")
@CrossOrigin

public class InstituteRestController {
	@Autowired
	private InstituteService service;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addInstitute(@RequestBody Institute institute) {
		ResponseEntity<String> response;
		boolean result=service.addInstitute(institute);
		if(result){
			response=new ResponseEntity<String>("Institute  is added",HttpStatus.CREATED);
		}else{
			response=new ResponseEntity<String>("Institute is not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@RequestMapping(path="{instituteCode}/{setPassword}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Institute LoginInstitute(@PathVariable("instituteCode") int instituteCode,@PathVariable("setPassword") String setPassword) {
		
		Institute institute =  service.loginInstitute(instituteCode, setPassword);
			
		return institute;
	}
	
	
	
	
	
}
