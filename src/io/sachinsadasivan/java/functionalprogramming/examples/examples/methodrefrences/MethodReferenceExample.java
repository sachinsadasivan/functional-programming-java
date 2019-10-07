package io.sachinsadasivan.java.functionalprogramming.examples.examples.methodrefrences;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(()-> printMessage());
		t.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello world!");
	}

}
