package io.sachinsadasivan.java.functionalprogramming.examples.examples.collections;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Charlie", "Smith", 100),
				new Employee("Lewis", "Carrol", 600),
				new Employee("Sam", "Thomas", 70),
				new Employee("Matthew", "Feming", 726),
				new Employee("Arnold", "Miller", 234), 
				new Employee("John", "Casey", 30),
				new Employee("Peter", "Cook", 200)
				);

		employees.stream()
		.filter(e -> e.getLastName().startsWith("C"))
		.forEach(e -> System.out.println(e));
		
	}

}
