package com.citop.service.soap;

import java.util.List;

import com.cifop.entity.Student;
import com.citop.service.StudentService;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.jws.WebService;


@Stateless
@WebService
public class StudentSoapWebserviceImpl implements StudentSoapWebservice{

	@EJB
	StudentService studentService;
	

	@Override
	public Student findStudentById(long id) {
		return studentService.findById(id);
	}

	@Override
	public List<Student> findListOfStudents() {
		return studentService.findStudents();
	}

}
