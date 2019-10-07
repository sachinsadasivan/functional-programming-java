package io.sachinsadasivan.java.functionalprogramming.examples.examples6.runnableexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.sachinsadasivan.java.functionalprogramming.examples.examples7.standardfunctionalinterfaces.Employee;

import static java.util.Comparator.comparing;

public class SortingExample {

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
	
	Collections.sort(employees, (e1, e2)-> e1.getLastName().compareTo(e2.getLastName()));
	
	// Method Reference
	//employees.sort(comparing(Employee::getLastName));
	
	for (Employee employee: employees) {
		System.out.println(employee);
	}
	

	}

}
