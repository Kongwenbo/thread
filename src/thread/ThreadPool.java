package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		// ��������
		BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
		// �������б�������
		RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
		// �����̳߳�
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 60L, TimeUnit.SECONDS, workQueue, handler);
		
	}
}
