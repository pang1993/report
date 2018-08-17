package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������Ϊ�Ƽ�ʹ���̳߳ط���
		//������̳߳ط�����ִ���̶߳࣬�ڴ�ռ��������Ҫ��������
		//ExecutorService executor = Executors.newCachedThreadPool();
		//�˷���ͬʱִֻ��һ���̣߳�Ч�ʲ�ڴ�ռ��С
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//�˷������ڴ����ƶ���С���̳߳�
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
			System.out.println("����ִ��"+n+"�߳�");
			try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�߳�"+n+"ִ�����");
		}
	}

}
