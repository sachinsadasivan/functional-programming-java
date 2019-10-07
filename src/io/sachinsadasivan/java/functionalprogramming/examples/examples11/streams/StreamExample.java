package io.sachinsadasivan.java.functionalprogramming.examples.examples11.streams;

import java.util.Arrays;
import java.util.List;

import io.sachinsadasivan.java.functionalprogramming.examples.examples.collections.Employee;

public class StreamExample {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Shaun", "Pollock", 300),
				new Employee("Peter", "Muller", 900),
				new Employee("Michael", "Clarke", 500),
				new Employee("Bendon", "Mccullum", 700),
				new Employee("Dominic", "Cork", 100),
				new Employee("Alister", "Cook", 400),
				new Employee("Shane", "Watson", 150),
				new Employee("Allan", "Donald", 370),
				new Employee("Glenn", "Maxwell", 200)
			);

		
		employees.stream()
		.filter(e -> e.getLastName().startsWith("C"))
		.forEach(System.out::println);

	}

}
