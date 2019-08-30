package db.dao;

import db.dto.Employee;

public class QueryExecutor {
	public static void main(String [] args){
		Employee e = new Employee("전우형","201903670","금융사업부","남","증권사업팀");
		EmployeeDao dao = new EmployeeDao();
		dao.insertData(e);
	}
}
