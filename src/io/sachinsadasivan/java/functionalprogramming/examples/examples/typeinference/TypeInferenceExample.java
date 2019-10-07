package io.sachinsadasivan.java.functionalprogramming.examples.examples.typeinference;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthLambda myLambda = (str) -> str.length();
		System.out.println(myLambda.getLength("Network Element"));
	}

	
	interface StringLengthLambda {
		int getLength(String str);
	}


}
