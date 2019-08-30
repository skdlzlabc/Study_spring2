package com.sample.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.example.dto.Parent;
import com.sample.example.dto.Student;

@RestController
public class RestStudentClass extends Parent {

	// @RequestMapping(value = "/rest/student/info")
	@RequestMapping(value = "/rest/student/info", method = RequestMethod.GET)
	public @ResponseBody Student studentInfo(@ModelAttribute Student student, HttpServletRequest request) {
		System.out.println(student.toString());
		// request.setAttribute("student", student);
		// return "student/student_info";
		return student;
	}
}
