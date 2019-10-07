package io.sachinsadasivan.java.functionalprogramming.examples.examples.runnable;

public class LambdaVsAnonymousClassExamples {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printing inside Runnable");
				System.out.println(this);
				
			}
			
			@Override
			public String toString() {
				return "From Anonymous Class";
			}
			
			
		});
		
		myThread.start();

		Thread myLambdaThread = new Thread(() -> {
			System.out.println("Printing inside Lambda");
			//System.out.println(this);
			
		});
		
		myLambdaThread.start();
		
		
		
	}


	
}
