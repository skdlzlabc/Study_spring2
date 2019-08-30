//2019.8.23
package db.dto;

//계층간 데이터 교환을 위한 자바빈즈
// 순수한 데이터 객체이며 속성과 그 속성에 접근하기 위한 getter, setter 메소드만 가진 클래스
public class Employee {
	//이름, 사번, 부서, 성별, 직무
	private String name;
	private String empNo;
	private String dept;	//금융, 제조/방산, 서비스/유화, 데이터센터
	private String gender;
	private String duty;	//ICT 서비스, 정보보호, R&D, ICT 인프라
	
	public Employee() {
	}

	public Employee(String name, String empNo, String dept, String gender, String duty) {
		this.name = name;
		this.empNo = empNo;
		this.dept = dept;
		this.gender = gender;
		this.duty = duty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}
	
	
}//end of Employee class
