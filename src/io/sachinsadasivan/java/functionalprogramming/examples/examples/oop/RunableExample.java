package io.sachinsadasivan.java.functionalprogramming.examples.examples.oop;

public class RunableExample {
	
	String name = "Network Element";

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable...");
				System.out.println(this);
				
			}
			
			@Override
			public String toString() {
				return "This an anonymeus inner class";
				
			}
		});

		
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Runnable..."));
		
		
		
		myThread.start();
		//myLambdaThread.start();


	}

}
