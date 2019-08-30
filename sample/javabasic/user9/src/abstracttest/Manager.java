//인터페이스는 왜 쓸까?! => 완전한 추상화를 달성하기 위해서 사용
package abstracttest;

public class Manager {
//	Lazyworker lazyWorker = new Lazyworker();	//이거를 이제 안써도 됨
// 	Newworker newWorker = new Newworker();		//
//	Smartworker smartWorker = new Smartworker();//
	
	IWorker iworker;
	
//	public void manage(){	//이거를 이제 안써도 됨
//		lazyWorker.work();	//
//		newWorker.work();	//
//		smartWorker.work();	//
//	}

	public void manage(IWorker i){
		this.iworker = i;
		iworker.work();
	}
	
	public static void main(String[] args) {
		Manager woo = new Manager();
		woo.manage(new NewOne());
		woo.manage(new SmartOne());
		woo.manage(new LazyOne());
	}//end of main
	
}//end of class
