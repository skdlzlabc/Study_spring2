package test1;

public class MethodTest {
	private int num = 10;
	
	public MethodTest() {
		super();
	}

	public MethodTest(int num) {
		super();
		this.num = num;
	}

	public int getNum() {				//1.getter 사용
		System.out.print("1.getter사용 : ");
		return num;
	}

	public void setNum(int num) {		//2.setter 사용
		this.num = num;
	}
	
	public int returnSomething(){		//2. 반환 타입이 있는 메소드
		System.out.print("2.반환타입 있는 메소드 : ");
		return this.num;
	}
	
	public int returnSomething(int a){	//6. 오버로딩
		System.out.print("6.오버로딩 : ");
		return a;
	}
	
	public void returnNothing(){		//3. 반환 타입이 없는 메소드
		System.out.println("3.반환타입 없는 메소드");
	}
	
	public void throwError(int input) throws Exception{	//5. 메소드 선언 구성요소의 6가지 작성
		System.out.print("5.에러를 던지는 메소드 : ");
		if(input!=1){
			throw new Error("error");
		}
		else{
			System.out.println("정상");
		}
	}
	
	
}
