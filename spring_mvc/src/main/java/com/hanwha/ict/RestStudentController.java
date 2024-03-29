package com.hanwha.ict;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanwha.ict.dto.Student;
import com.hanwha.ict.dto.StudentServiceImpl;

@RestController
@RequestMapping("/rest/student")
public class RestStudentController {

	@Autowired
	StudentServiceImpl stuTest;
	
	@GetMapping("")
	public List<Student> getAll() {
		return stuTest.getList();
	}	
	
	@PostMapping("")
	public Student postTest(@RequestBody Student student) {
		return student;
	}
	
	@DeleteMapping("/{studentName}")
	public String deleteOne(@PathVariable String studentName){
		return studentName+"이 삭제되었습니다.";
	}
	
	@PutMapping("/{studentName}")
	public String putOne(@PathVariable String studentName){
		return studentName+"수정되었습니다.";
	}
}

//요청을 보내면 학생정보를 통쨰로 // 이전에는 String이였는데, 객체를 돌려줘 20개 정도를 리스트
//리스트에 student를 넘겨주는데 
//처음 받은 이름 뒤에 0~20까지
//리턴 리스트의 student를 가진 객체를 리턴










