package com.javalec.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// #1
		// String configLocation= "classpath:applicationCTX.xml";
		// AbstractApplicationContext ctx = new
		// GenericXmlApplicationContext(configLocation);
		// MyCalculator myCalculator =
		// ctx.getBean("mycalculator",MyCalculator.class);
		// //컨테이너 안에 있는 myCalculator객체를 가져와서 갖다 쓰면돼
		//
		// myCalculator.add();
		// myCalculator.sub();
		// myCalculator.mul();
		// myCalculator.div();
		// calculator를 di로 주입, xml에 선언, 함수인자 똑같이

		// #2
		// String configLocation= "classpath:applicationCTX.xml";
		// AbstractApplicationContext ctx = new
		// GenericXmlApplicationContext(configLocation);
		// HanwhaCompany hanwhaCompany =
		// ctx.getBean("hanwhacompany",HanwhaCompany.class);
		// HanwhaCompany hanwhaCompany1 =
		// ctx.getBean("hanwhacompany1",HanwhaCompany.class);
		// HanwhaCompany hanwhaCompany2 =
		// ctx.getBean("hanwhacompany2",HanwhaCompany.class);
		// System.out.println(hanwhaCompany.toString());
		// System.out.println(hanwhaCompany1.toString());
		// System.out.println(hanwhaCompany2.toString());

		// #3
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		HanwhaGroup hanwhaGroup = ctx.getBean("hanwhagroup", HanwhaGroup.class);
		//리스트객체에서 서비스유화를 구별할수있도록+
		Scanner sc = new Scanner(System.in);
		int num=0;
xx:		while(true){
			System.out.println("번호를 입력하세요. (9:종료)");
			num=sc.nextInt();
			//9입력시 종료
			if(num==9){
				System.out.println("종료합니다.");
				break xx;
			}
			//0,1,2 이외 번호 입력했을떄 예외처리
			if(num!=0 &&num!=1 &&num!=2){
				System.out.println("0,1,2를 입력하세요");
				continue;
			}
			System.out.println(hanwhaGroup.printAll(num));
		}
	}
}
