package com.hanwha.ict;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanwha.ict.dto.Student;

@Controller
public class StudentContoller {
	
	@RequestMapping("/student/info")
	public String studentCreate(@ModelAttribute("student") Student student){
		return "student/student_info";
	}
	
//	@RequestMapping("/student/info")
//	public String studentCreate(@ModelAttribute("student") Student student, HttpServletRequest request){
//		System.out.println(student.toString());
//		request.setAttribute("student", student);
//		return "student/student_info";
//	}
}
