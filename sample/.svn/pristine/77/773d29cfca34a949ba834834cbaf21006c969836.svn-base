//2019.8.21
package edu_8_21;

public class Test9_Thread_Real {
	public static void main(String[] args) throws InterruptedException {
		final int MAX_VALUE = 4_000_000;
		final int THREAD_CNT = 5;
		int perCount = MAX_VALUE / THREAD_CNT;
		
		ThreadSample2[] threadArr = new ThreadSample2[THREAD_CNT];
		
		long time2 = System.currentTimeMillis();
		
		for (int i = 0; i < THREAD_CNT; i++) {
			ThreadSample2 th1 = new ThreadSample2(i*perCount,perCount*(i+1)-1);
			th1.start();
			threadArr[i] = th1;
		}
		
		//thread 다 종료 할때 까지 기다리는 메서드 작성
		for (ThreadSample2 t : threadArr) {
			t.join();			//thread 종료 댈때까지 기다려 **************
		}
		
		System.out.println("Thead 소요시간: "+ (System.currentTimeMillis() - time2) + "ms");
		
	}//end of main
}//end of class

class ThreadSample2 extends Thread{
	private int startNum;
	private int endNum;

	public ThreadSample2() {
	}
	
	public ThreadSample2(int startNum,int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	@Override
	public void run() {
		for (int i = startNum, cnt = endNum-startNum + 1; i < cnt; i++) {	
			//cnt = endNum-startNum + 1 : for문 돌때 한번만 계산하라고 넣음
			System.out.println(i);
		}
	}
}//end of ThreadSample2 class