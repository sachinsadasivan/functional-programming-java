package io.sachinsadasivan.java.functionalprogramming.examples.examples.oop;

import io.sachinsadasivan.java.functionalprogramming.examples.examples2.greeting.Greeting;

public class LambdaGreeter {
	
	private static void greet(Greeting greeting) {
		greeting.perfrom();
	}

	public static void main(String[] args) {
		
		GreetingLambda greetingFunction = () -> System.out.println("Hello World");
		greetingFunction.message();
		
		DoubleNumberLambda doubleNumber = (int a) -> a * 2; 
		System.out.println("Double Number : " + doubleNumber.doubleNumber(10));
		
		AddLambda addFunction = (int a, int b) -> a + b;
		System.out.println("Add function: " + addFunction.add(10, 20));
		
		SafeDivideLambda safeDivide = (int a, int b) -> {
			if (b == 0) return 0;
			else return a / b;
		};
		
		System.out.println("Safe division: " + safeDivide.safeDivide(10, 2));
		
		StringLenghtCountLambda stringLengthCounter = (String str) -> str.length();
		System.out.println("String Lenght Count: " + stringLengthCounter.stringLenghtCount("Ericssson Network Manager"));
		
	}
	
}

interface GreetingLambda {
	void message();
}

interface AddLambda {
	int add(int x, int y);
}

interface DoubleNumberLambda {
	int doubleNumber(int a);
}

interface SafeDivideLambda {
	int safeDivide (int a, int b);
}

interface StringLenghtCountLambda {
	int stringLenghtCount (String str);
}



