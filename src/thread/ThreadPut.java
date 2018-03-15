package thread;

public class ThreadPut implements Runnable {

	private Test test = new Test();

	public ThreadPut(Test test) {
		super();
		this.test = test;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		test.put(new Object());
	}

}
