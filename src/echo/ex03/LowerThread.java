package echo.ex03;

public class LowerThread extends Thread {

	public void run() {
		
		
		
		
		
		for(char ch='a';ch<='z';ch++) {
			
			
			
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
