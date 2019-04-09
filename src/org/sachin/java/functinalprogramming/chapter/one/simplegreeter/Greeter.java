package org.sachin.java.functinalprogramming.chapter.one.simplegreeter;

public class Greeter {

	private void greet(Greeting greeting) {
		greeting.perfrom();
	}
	
	public static void main(String[] args) {
		Greeting greeting = new HelloWorldGreeting();
		Greeter greeter = new Greeter();
		greeter.greet(greeting);			
	}
	
}
