package com.ncsl.springbootcrudpackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ncsl.springbootcrudpackage.entity.Student;
import com.ncsl.springbootcrudpackage.repository.StudentRepository;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepository studentRepository;
	@GetMapping("/")
	public String home(Model m) {
		List<Student> allstu = studentRepository.findAll();
		m.addAttribute("allstu",allstu);
		return "home";
	}
	@GetMapping("/add_student/name={name}/studentid={studentid}")
	public String addstudent(@PathVariable("name") String name,@PathVariable("studentid") String studentid,Model m) {
		Student s = new Student();
		s.setName(name);
		s.setStudentId(studentid);
		studentRepository.saveAndFlush(s);
		m.addAttribute("student",s);
		return "view_student";
	}
}
