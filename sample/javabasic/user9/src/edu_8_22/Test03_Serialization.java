//2019.8.22 Serialization
package edu_8_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test03_Serialization {

	/**
	 * 객체 쓰기
	 */
	static void a1(){
		Member member = new Member("wooHyung", 26, System.currentTimeMillis());
		File file = new File("C:/Users/user/Desktop/member.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 	//객체 내보내기
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(member);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(oos!= null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}//end of a1 method
	
	/**
	 * 객체 읽기
	 */
	static void a2(){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:/Users/user/Desktop/member.txt");
			ois = new ObjectInputStream(fis);
			Member c2 = (Member) ois.readObject();
			System.out.println(fis);

			System.out.println(c2.getName());
			System.out.println(c2.getAge());
			System.out.println(c2.getLastAccessTime());
			System.out.println(c2.getAddress());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end of a2 method
	
	public static void main(String[] args) {
		
		a2();
		
	}//end of main
}//end of class

class Member implements Serializable{
	private String name;
	private int age;
	private long lastAccessTime;
	private String address;
	private static final long serialVersionUID = 1L;	//이렇게 버전을 명시해줘야지, 역직렬화 했을때 에러가 안남!! ******************
														//근데 null이 나올 수 도 있기에, 클래스를 업데이트 했을때 버전을 바꿔줘야함!! *********
	public Member(String name, int age, long lastAccessTime) {
		this.name = name;
		this.age = age;
		this.lastAccessTime = lastAccessTime;
	}
	
	public Member(String name, int age, long lastAccessTime, String address) {
		this.name = name;
		this.age = age;
		this.lastAccessTime = lastAccessTime;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getLastAccessTime() {
		return lastAccessTime;
	}

	public String getAddress() {
		return address;
	}
	

}//end of Member class


