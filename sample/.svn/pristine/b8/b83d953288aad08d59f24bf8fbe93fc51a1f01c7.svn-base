//2019.8.20 객체 지향 프로그래밍 실습

/* 
 * Try.java
 * v.1.0.
 * 2019.8.20
 * Copyright Jeon
 */

package textpac;

import pac.PublicClass;

public class Try {
	public static void main(String[] args) {
//####################################################
//## 다른 패키지의 public, default 접근 제어자를 클래스 접근		
		PublicClass p;	//퍼블릭 : 접근 가능
//		DefaultClass d;	//디폴트 : 접근 불가
		
//#####################################################
//## 접근 제어자를 가진 변수를 선언하여 다른 클래스에서 접근이 가능한지 확인		
		Try2 t;
		t = new Try2();
		t.pubInt = 1;
		t.deInt = 2;
//		t.priInt = 3; 	//private : 불가
		t.proInt = 4;
	}
}

class Try2{
	public int pubInt;
	int deInt;
	private int priInt;
	protected int proInt;

	public Try2() {
	}
}

//상속
class Try3 extends Try2{	
}


















