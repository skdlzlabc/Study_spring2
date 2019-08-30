package test1;

//구성관계		: 부모꺼를 전부 물려 받지 않는 경우
public class CompositionTest{
	public static void main(String[] args) {
		Parent2 h = new Parent2();
		h.getCoffee();
	}
}

class Parent2{
	Son2 my = new Son2();
	//얘가 해야 될 일을 내가 해야할 부분에서 호출해주면돼 : has a
	public void getCoffee(){
		my.buyCoffee();
	}
}

class Son2{
	public void buyCoffee(){
		System.out.println("buyCoffee");
	}
}
