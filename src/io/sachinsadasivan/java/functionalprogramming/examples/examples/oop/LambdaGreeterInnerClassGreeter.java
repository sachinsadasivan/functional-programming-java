package io.sachinsadasivan.java.functionalprogramming.examples.examples.oop;

import io.sachinsadasivan.java.functionalprogramming.examples.examples2.greeting.Greeting;

public class LambdaGreeterInnerClassGreeter {
	
	private static void greet(Greeting greeting) {
		greeting.perfrom();
	}

	public static void main(String[] args) {
		
		Greeting innerClassFunction = new Greeting() {
			
			@Override
			public void perfrom() {
				System.out.println("Hello World");
				
			}
		};
		
		Greeting lambdaFunction = () -> System.out.println("Hello World");
		
		greet(innerClassFunction);
		greet(lambdaFunction);
			
	}

}
