package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

	BlockingQueue<Object> workQUeue = new ArrayBlockingQueue<Object>(10, false);
	
	public void put(Object smt){
		try {
			workQUeue.put(smt);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------put");
		System.out.println("put后阻塞队列:"+workQUeue.size());
	}
	
	public void take(){
		try {
			workQUeue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("take------");
		System.out.println("take后阻塞队列:"+workQUeue.size());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test test = new Test();
		
		for (int i = 0; i < 100; i++) {
			Thread threadPut = new Thread(new ThreadPut(test), "PUT");
			threadPut.start();
		}
		
		for (int i = 0; i < 98; i++) {
			Thread threadTake = new Thread(new ThreadTake(test), "TAKE");
			threadTake.start();
		}
		
	}
}
