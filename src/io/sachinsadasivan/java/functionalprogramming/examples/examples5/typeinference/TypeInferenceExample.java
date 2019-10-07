package io.sachinsadasivan.java.functionalprogramming.examples.examples5.typeinference;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthLambda myLambda = (String str) -> str.length();
		System.out.println("String Lenght: " + myLambda.getLength("Network Element"));
		
		SafeDivideLambda safeDivideLambda = (int a, int b) -> {
			if (b == 0) return 0;
			else return a / b;
		};
		
		System.out.println("Safe Divide: " + safeDivideLambda.safeDivide(10, 2));
	}
	
	interface StringLengthLambda {
		int getLength(String str);
	}

	interface SafeDivideLambda {
		int safeDivide(int a, int b);
	}

}
