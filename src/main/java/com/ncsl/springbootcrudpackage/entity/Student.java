package com.ncsl.springbootcrudpackage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="studentId",length=50,nullable=false,unique=true)
	private String studentId;
	
	@Column(name="name",length=255,nullable=false,unique=false)
	private String name;

	@OneToMany
    @JoinColumn(name = "student_id") // we need to duplicate the physical information
    private Set<StudentAttendence> studentAttendence;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
