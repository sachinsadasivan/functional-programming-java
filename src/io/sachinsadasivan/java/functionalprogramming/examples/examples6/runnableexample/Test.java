package io.sachinsadasivan.java.functionalprogramming.examples.examples6.runnableexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.sachinsadasivan.java.functionalprogramming.examples.examples7.standardfunctionalinterfaces.Employee;

public class Test {

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
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getFirstName().compareTo(emp2.getFirstName());
			}
			
		});
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, (employee1, employee2) -> employee1.getFirstName().compareTo(employee1.getFirstName()));

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
