package py.edu.ucsa.lab03.Wilcards;

import py.edu.ucsa.lab02.Wilcards.Person;

public class Employee extends Person {

	public Employee(String name, String lastName) {
		super(name, lastName);
		
	}

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
