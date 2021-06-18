package echo.ex04;

public class Multithread {

	public static void main(String[] args) throws InterruptedException {
		
		//DigitRunableimpl digit = new DigitRunableimpl();
		
		Thread thread = new Thread(new DigitRunableimpl());
		
		thread.start();
		
		 for (char ch = 'A'; ch<='Z'; ch++) {
			 
			 System.out.println(ch);
			 
			 Thread.sleep(1000);
			 
		 }
		

	}

}
