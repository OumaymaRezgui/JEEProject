package com.cifop.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@NamedQuery(
		name="classRoomByName",
		query = "SELECT c FROM ClassRoom c where c.name LIKE :classRoomName")
@Entity
@Table(name = "Class")
public class ClassRoom {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
private String grade;
private String name;

public ClassRoom() {
}



public String getGrade() {
	return grade;
}



public void setGrade(String grade) {
	this.grade = grade;
}



public long getId() {
	return id;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@OneToMany
private List<Student> students = new LinkedList<>();
}