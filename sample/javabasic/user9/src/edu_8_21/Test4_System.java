//2019.8.21 / java.lang 패키지 / 각종 정보를 확인할 수 있는 클래스
package edu_8_21;

public class Test4_System {
	public static void main(String[] args) {
//		1.시스템 속성 값 관리
		System.out.println(System.getProperties());
		
//		2.시스템 환경 값 조회
		System.out.println(System.getenv());

//		3.GC 수행
		System.gc();
		
//		4.JVM 종료
		System.exit(0);
		
//		5.현재 시간 조회
		System.out.println(System.currentTimeMillis());
		
	}//end of main
}//end of class
