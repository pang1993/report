package main;

public class TestRunable {

	public static void main(String[] args) {
		Thread a = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i<=99;i++) {
					System.out.println(i);
				}
			}
		};
		a.start();
		Thread b = new Thread(new Test());
		b.start();
		try {
			Thread c = new Thread(new TestRunable().new c());
		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("hhhhh");
	}
	
	class c implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("daifjeafj");
		}
		
	}

	
}
