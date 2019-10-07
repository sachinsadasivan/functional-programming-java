package io.sachinsadasivan.java.functionalprogramming.examples.examples.runnable;

public class RunnableExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printing from Runnable");
				
			}
		});
		
		
		myThread.start();
		
		// Implemented way before Java 8
		Thread myLambdaThread =  new Thread(()-> System.out.println("Printing from Lambda Runnable"));
		myLambdaThread.start();
		
		
	}
	
}
