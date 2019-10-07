package io.sachinsadasivan.java.functionalprogramming.examples.examples4.syntaticsugar;

public class SyntacticSugar 	{

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting() {
			@Override
			public void perfrom() {
				System.out.println("Hello World from Innter Class");
			}
		};

		greeting.perfrom();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World from Lambda");
			
		lambdaGreeting.perfrom();
	}

}
