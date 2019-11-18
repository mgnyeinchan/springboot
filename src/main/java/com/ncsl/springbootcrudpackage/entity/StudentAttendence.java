package com.ncsl.springbootcrudpackage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ncsl.springbootcrudpackage.entity.Student;
@Entity
@Table(name="studentAttendence")
public class StudentAttendence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="subject",length=50,nullable=false,unique=false)
	private String subject;
	
	@ManyToOne
	@JoinColumn(name="student_id",nullable=false)
	private Student student;
	
}
