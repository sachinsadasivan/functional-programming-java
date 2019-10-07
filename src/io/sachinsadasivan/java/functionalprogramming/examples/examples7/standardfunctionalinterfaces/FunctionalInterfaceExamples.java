package io.sachinsadasivan.java.functionalprogramming.examples.examples7.standardfunctionalinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceExamples {

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
		
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee employee1, Employee employee2) {
				return employee1.getFirstName().compareTo(employee2.getFirstName());
			}
			
		});
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, (e1, e2)-> e1.getFirstName().compareTo(e2.getFirstName()));
		
		// Predicate Example
		// TODO: Consumer example
		printConditionally(employees, (employee)-> true, employee -> System.out.println(employee));
		
		//Predicate<Employee> predicate = p -> p.getLastName().startsWith("C");
		//printConditionally(employees, predicate);
	}

	public static void printConditionally(List<Employee> employees, ConditionCheckerLambda<Employee> checkCondition, Consumer<Employee> consumer) {
		for (Employee employee : employees) {
			if (checkCondition.test(employee)) {
				consumer.accept(employee);
			}
		}
	}
	
	
}

interface ConditionCheckerLambda <T> {
	boolean test(T t);
}
