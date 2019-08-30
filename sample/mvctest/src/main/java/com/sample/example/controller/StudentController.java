package com.sample.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.example.dto.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student/info")
	public String studentInfo(@ModelAttribute("student") Student student, HttpServletRequest request) {
		System.out.println(student.toString());
		request.setAttribute("student", student);
		return "student/student_info";
	}
}
