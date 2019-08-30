//2019.8.21	컬렉션 프레임워크
package edu_8_21;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Test7_Collection {
	public static void main(String[] args) {
//		Collection 추가, 삭제, 출력
		
//		#1.어레이리스트
		ArrayList<String> al = new ArrayList<String>();
		al.add("arrayList1");					//추가
		al.add("arrayList2");
		al.add("arrayList3");
		al.remove(1);							//삭제
		System.out.println("#1. ArrayList 출력");
		for (String str : al) {	
			System.out.println(str);			//출력
		}
		System.out.println();
		
		
//		#2.해쉬셋
		String[] items = {"a","a","b","b","c","d",};
		HashSet<String> hs = new HashSet<String>(Arrays.asList(items));
		for(String item : hs){					//추가
			hs.add(item);
		}
		hs.remove("a");							//삭제
		System.out.println("#2. HashSet 출력");	//출력
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) { 
			    System.out.print(iterator.next() + ", "); 
		}
		System.out.println("\n");
		
		
//		#3.어레이데큐
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("ArrayDeque1");						//추가
		ad.add("ArrayDeque2");
		ad.add("ArrayDeque3");
		ad.remove();								//삭제
		System.out.println("#3. ArrayDeque 출력");	//출력
		while(!ad.isEmpty()){
			System.out.print(ad.pop()+", ");
		}
		System.out.println("\n");
		
//		#4.해쉬맵
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Apple",1000);						//추가
		hm.put("Banana",2000);
		hm.put("Cawboy",3000);
		hm.remove("Banana");						//삭제
		System.out.println("#4. HashMap 출력");		//출력
		for(String key : hm.keySet()){
			System.out.println("이름 : " + key + ", 가격 : " + hm.get(key) + "원");
		}
		System.out.println("\n");

//		#5.트리맵
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("a", 30);							//추가
		tm.put("b", 20);
		tm.put("c", 10);
		tm.remove("b");								//삭제
		System.out.println("#5. TreeMap 출력");		//출력
		for(String key : tm.keySet()){
			System.out.println("키 : " + key + ", 값: " + tm.get(key));
		}
		System.out.println("\n");
		
		
	}//end of main
}//end of class
