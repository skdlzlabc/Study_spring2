//2019.8.22 파일 생성 및 복사
package edu_8_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_File {

	static boolean printResult(String msg,boolean isSuccess){
		if(isSuccess){
			System.out.println(msg+" 생성 성공");
		}else{
			System.out.println(msg+" 생성 실패");
		}
		return isSuccess;
	}//end of printResult method
	
	public static void main(String[] args) {
		
		//#1. 파일 생성하기
		String practiceFilePath = System.getProperty("user.dir")+ "/practice";		//속성에 user.dir이라는 키 값으로 값이 하나 있음.
		boolean isSuccess = FileManager.makeDirectories(practiceFilePath);
		if(!printResult("폴더",isSuccess)){
			return;	//폴더 생성 실패시 밑에 안내려가고 여기서 끝내기
		}
		
		//#2. 파일 복사하기
		boolean isCopySuccess = FileManager.copyFile("C:/Users/user/Desktop/simson.jpg"
				,practiceFilePath + "/image.jpg");
		printResult("파일",isCopySuccess);
		
	}//end of main
}//end of class

class FileManager{
	/**
	 * 사용자가 입력한 경로대로 디렉토리를 생성한다.
	 * @param path 생성하려고 하는 경로
	 * @return 디렉토리 생성 성공 여부
	 */
	public static boolean makeDirectories(String path){
		File file = new File(path);
		
		if(!file.exists()){
			return file.mkdirs();
		}
		
		return true;
	}

	/**
	 * 파일을 복사한다.
	 * @param originPath 원본 파일의 경로
	 * @param targetPath 복사할 파일의 경로
	 * @return
	 */
	public static boolean copyFile(String originPath, String targetPath){
		File originFile = new File(originPath);
		
		//	원본이 없으면 복사 실패 	|| 파일이 아니라 디렉토리면 팅겨내기
		if(!originFile.exists() || originFile.isDirectory()){
			return false;		
		}
		
		File targetFile = new File(targetPath);
		
		// 이미 해당 파일이 있을경우 덮어쓰기 안함
		if(!targetFile.exists()){
			return false;
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		boolean isSuccess=true;
		
		try {
			fis = new FileInputStream(originFile);	//file에서 Stream을 읽어 올 수 있는 
			fos = new FileOutputStream(targetFile);//targetFile에 쓸 수 있는 outputStream이 생성됨
			//들어온 Stream 읽어 들이기
			
			int data = 0;
			while((data = fis.read()) !=-1){	//next byte를 계속 가져옴, 파일의 끝에 도달할 때 까지
				fos.write(data);
			}
			
		} catch (IOException e) {
			isSuccess = false;
		} finally {
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					isSuccess = false;
				}
			}
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					isSuccess = false;
				}
			}
		}
		
		return isSuccess;	
	}//end of copyFile method
}//end of FileManager class



