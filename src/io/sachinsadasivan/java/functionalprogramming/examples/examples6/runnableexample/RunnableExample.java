package io.sachinsadasivan.java.functionalprogramming.examples.examples6.runnableexample;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				printMessage("Printed Inside Runnable");								
			}
		});
	
		myThread.start();
		
		Thread myLambndaThread = new Thread (()-> System.out.println("My Lambda Thread"));
		myLambndaThread.start();
		
	}
	
	public static void printMessage(String msg) {
		System.out.println(msg);
	}

}
