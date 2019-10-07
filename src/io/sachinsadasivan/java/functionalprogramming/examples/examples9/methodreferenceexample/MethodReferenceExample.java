package io.sachinsadasivan.java.functionalprogramming.examples.examples9.methodreferenceexample;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(() -> printMessage()); // ()->() or (p)-> (p)
		myThread.start();
		
	}
	
	public static void printMessage() {
		System.out.println("Running in a Thread");
	}

	
}

