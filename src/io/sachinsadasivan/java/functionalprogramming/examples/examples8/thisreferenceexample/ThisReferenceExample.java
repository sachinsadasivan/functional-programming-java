package io.sachinsadasivan.java.functionalprogramming.examples.examples8.thisreferenceexample;

public class ThisReferenceExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable");
							
			}
		});

		myThread.start();
		
		
		Thread myLambdaThread = new Thread(() -> {
					System.out.println("Inside Runnable");
		});
	
		myLambdaThread.start();
		
	
	
	
	}
	

}
