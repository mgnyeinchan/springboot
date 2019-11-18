package com.ncsl.springbootcrudpackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ncsl.springbootcrudpackage.entity.*;
public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query("select s from Student s where s.name=?1")
	Student findByname(String name);
}
