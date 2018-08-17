package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以下两种为推荐使用线程池方法
		//下面的线程池方法可执行线程多，内存占用量大，需要定制配置
		//ExecutorService executor = Executors.newCachedThreadPool();
		//此方法同时只执行一个线程，效率差但内存占用小
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//此方法用于创建制定大小的线程池
		for(int  j = 0 ; j < 10 ; j ++) {
			System.out.println(j);
			ExecutorService executor = Executors.newFixedThreadPool(10);
			for(int i = 0 ; i < 10 ; i++) {
				TestThreadPool pool = new TestThreadPool();
				Test test = pool.new Test(i);
				executor.execute(test);
			}
			executor.shutdown();
		}		
	}
	
	
	class Test implements Runnable{
		private int n;
		
		public Test(int num) {
			n = num;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("正在执行"+n+"线程");
			try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("线程"+n+"执行完毕");
		}
	}

}
