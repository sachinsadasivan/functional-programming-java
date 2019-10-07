package io.sachinsadasivan.java.functionalprogramming.examples.examples7.standardfunctionalinterfaces;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeId;
	
	public Employee(String firstName, String lastName, int employeeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + "]";
	}
	
	

}
