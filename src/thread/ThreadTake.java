package thread;

public class ThreadTake implements Runnable {

	private Test test = new Test();

	public ThreadTake(Test test) {
		super();
		this.test = test;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5*100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		test.take();
	}

}
