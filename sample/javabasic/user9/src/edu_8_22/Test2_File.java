//2019.8.22 File
package edu_8_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2_File {
	
	static void a1(){
//		1. File 클래스를 이용해 실습을 위한 디렉토리를 생성하자.
		File f1= new File("C:\\Users\\user\\Desktop","test");
		
		if(!f1.exists()) {		// 파일이 존재하지 않으면 만들어라
			System.out.println(f1.mkdir());
			System.out.println("파일생성됨");
		}
	}
	
	static void a2(){
//		2. Stream을 사용해 이미지 파일을 다른 경로에 복사해보자.
		File f2 = new File("C:\\Users\\user\\Desktop\\image.jpg");
		File f3 = new File("C:\\Users\\user\\Desktop\\test\\image.jpg");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f2);
			fos = new FileOutputStream(f3);
			int i;
			while((i=fis.read()) != -1){
				fos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
	
	static void a3(){
//		3. 2에서 만든 이미지 파일의 경로와 파일명을 변경해보자.
		File f4 = new File("C:\\Users\\user\\Desktop\\test\\image.jpg");
		File fileNew = new File("C:/Users/user/Desktop/image3.jpg");
		if(f4.exists()) {
			f4.renameTo(fileNew);
			System.out.println("성공적으로 바뀜!");
		}
	}
	
	static void a4() throws IOException{
//		4. Stream을 사용해 콘솔에서 입력받은 내용을 .txt 파일에 써보자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		File f5 = new File("C:/Users/user/Desktop/test/note.txt");
		
		FileOutputStream fos = null;
		try {
			byte[] content = str.getBytes();
			fos = new FileOutputStream(f5);
			fos.write(content);
			fos.flush();
			System.out.println("txt에 저장 성공");
		} catch (IOException e) {
			e.printStackTrace();	
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void a5() throws IOException{
//		5.Stream을 사용해 .txt파일에 있는 내용을 읽어서 콘솔에 출력
		//character stream : 한글자의 정보를 2byte에 담아서 전송
		File f6 = new File("C:/Users/user/Desktop/test/note.txt");
		FileReader fr = new FileReader(f6);
		BufferedReader br = new BufferedReader(fr);
		for (String str; (str = br.readLine())!=null;) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
//		a1();
//		a2();
//		a3();
//		a4();
		a5();
	}//end of main
}//end of class
