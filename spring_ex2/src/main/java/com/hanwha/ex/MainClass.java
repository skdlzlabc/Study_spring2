package com.hanwha.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		TestService ts = ctx.getBean("testService", TestService.class);
		ts.sendParam("hi");	//이거를 호출하려할때 발생하는 과정이다.
		
//		Student student = ctx.getBean("student", Student.class);
//		student.getStudentInfo();
//		
//		Worker worker = ctx.getBean("worker", Worker.class);
//		worker.getWorkerInfo();
		
		ctx.close();
		
	}
	
}
