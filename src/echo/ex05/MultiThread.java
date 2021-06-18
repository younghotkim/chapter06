package echo.ex05;

public class MultiThread {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new DigitRunnableImpl());
		Thread thread2 = new Thread(new LowerRunnableImpl());
		Thread thread3 = new Thread(new UpperRunnableImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
