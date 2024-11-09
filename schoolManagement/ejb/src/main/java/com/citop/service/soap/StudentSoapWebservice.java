package com.citop.service.soap;

import java.util.List;

import com.cifop.entity.Student;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface StudentSoapWebservice {
	
	
	@WebMethod
	public Student findStudentById(@WebParam(name = "id",targetNamespace = "http://webservices.school.cifop.com/") long id);
	
	@WebMethod
	public List<Student> findListOfStudents();
	

}
