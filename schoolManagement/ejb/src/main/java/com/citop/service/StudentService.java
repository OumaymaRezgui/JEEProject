package com.citop.service;

import java.util.List;

import com.cifop.entity.Student;

import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class StudentService {
	
    @PersistenceContext
	private EntityManager entityManager;
 
    public void saveStudent(Student student) {
    	entityManager.persist(student);
    }
    
    public void deleteStudent(Student student) {
    	entityManager.remove(student);
    }
    
    public Student findById(long id){
    	return entityManager.find(Student.class, id);	
    }
    
    public Student updateStudent(Student student) {
    	return entityManager.merge(student);
    }
    
    public List<Student> findStudents(){
    	return entityManager.createQuery("select s from Student s").getResultList();
    }
    
}
