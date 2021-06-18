package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) {
		
		DigitThread thread = new DigitThread();
		
		thread.start();
		
		//Start()내부에 출장준비(이동. 자리세팅)
		
		
		
		for(char ch='A'; ch<='Z'; ch++) {
				
				System.out.println(ch);
		
	    }
		
		
		
		
	} 
}
