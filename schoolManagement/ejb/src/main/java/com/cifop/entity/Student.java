package com.cifop.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;

@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String dress;
	private Date dateOfBrith;
}