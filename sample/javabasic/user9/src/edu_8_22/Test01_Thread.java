//2019.8.22 쓰레드 
package edu_8_22;

public class Test01_Thread {
	
	final static int MAX_VALUE = 36_000_000;	//값을 바꿀수 없고 메모리에 한번만 올라가는 변수
	final static int THREAD_CNT = 10;
	
	/**
	 * User 객체를 생성한다.	
	 */
	static void createUser(){
		for (int i = 0; i < MAX_VALUE; i++) {
			User user = new User(String.valueOf(i),i);	//value를 String으로 바꺼줌
		}
	}
	
	/**
	 * 쓰레드 없이 동작
	 */
	static void runWithNoThread(){
		for (int i = 0; i < THREAD_CNT; i++) {
			createUser();
		}	
	}

	/**
	 * 쓰레드 있이 동작
	 */
	static void runWithThread() throws InterruptedException{
		ThreadSample2[] thArr = new ThreadSample2[THREAD_CNT];

		for (int i = 0; i < THREAD_CNT; i++) {
			ThreadSample2 th1 = new ThreadSample2();
			th1.start();
			thArr[i] = th1;
		}

		for (ThreadSample2 t : thArr) {
			t.join(); 					// main메소드가 하나의 쓰레드를 기다리게 하는 메소드
		}

	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("메인메소드 시작");

		//#1. thread 없이 단순 처리
//		long startTime = System.currentTimeMillis();
//		runWithNoThread();
//		long endTime = System.currentTimeMillis();
//		System.out.println("#1. 소요시간 : "+ (endTime-startTime) + "ms");
		
		
		//#2. thread test
		long startTime = System.currentTimeMillis();
		runWithThread();
		long endTime = System.currentTimeMillis();
		System.out.println("#2. 소요시간 : "+ (endTime-startTime) + "ms");
		
		
		System.out.println("메인메소드 종료");
		
	}//end of main
}//end of class

class User {
	public String name;
	long seq;
	
	public User() {

	}
	
	public User(String name, long seq) {
		this.name = name;
		this.seq = seq;
	}
	
}//end of User class

class ThreadSample2 extends Thread{
	
	public ThreadSample2() {
	}
	
	@Override
	public void run() {
		System.out.println(this.getName()+" 시작");
		Test01_Thread.createUser();
		System.out.println(this.getName()+" 종료");
	}
	
}//end of ThreadSample2 class


