//2019.8.21	Calender Class
package edu_8_21;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test6_Calender {
	public static void main(String[] args) {
//		1. 오늘 날짜
		Calendar cal1 = Calendar.getInstance();
		Date date1 =cal1.getTime();
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date1));
		
//		2. 15일전의 날짜를 출력
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DAY_OF_MONTH, -15);
		Date date2 =cal2.getTime();
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date2));

//		3. 4달 후의 날짜를 출력
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.MONTH, 4);
		Date date3 =cal3.getTime();
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date3));

//		4. 2년후의 날짜를 출력
		Calendar cal4 = Calendar.getInstance();
		cal4.add(Calendar.YEAR, 2);
		Date date4 =cal4.getTime();
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date4));
		
	}//end of main
}//end of class