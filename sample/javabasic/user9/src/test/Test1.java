package test;

public class Test1 {
	
	public static void main(String[] args) {
		B1 b1 = new B1(3);
		B1 b2 = new B1();
	}//end of main
}//end of class

class A1{
	A1(){
		
	}
	A1(int a){
		System.out.println("A1");
	}
}//end of class

class B1 extends A1{
	B1(){
			
	}
	B1(int b){
		System.out.println("B1");
	}
}//end of class




