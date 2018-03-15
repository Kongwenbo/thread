package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		// 阻塞队列
		BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
		// 阻塞队列饱满策略
		RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
		// 创建线程池
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 60L, TimeUnit.SECONDS, workQueue, handler);
		
	}
}
