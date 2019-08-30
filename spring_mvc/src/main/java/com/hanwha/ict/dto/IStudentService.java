package com.hanwha.ict.dto;

import java.util.List;

public interface IStudentService {
	public String printAll(String str);
	public List<Student> getList();
	public String deleteOne(String str);
	public String putOne(String str);
}
