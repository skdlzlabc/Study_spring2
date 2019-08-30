package test1;

//상속관계
public class InheritanceTest {
	public static void main(String[] args) {
		Parent p = new Son();
		p.walkingHabit();
	}
}

class Parent{
	public void walkingHabit(){
		System.out.println("Parent's walkingHabit");
	}
	
	public void gettingDisease(){
		System.out.println("Parent got disease");
	}
}
class Son extends Parent{
	@Override
	public void walkingHabit() {
		System.out.println("Son's walkingHabit");
	}
	//쓸모 없는거 까지 상속 받음 : is a
	@Override
	public void gettingDisease() {
	}
	
}
