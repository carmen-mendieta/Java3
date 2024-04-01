package py.edu.ucsa.lab02.Wilcards;

public class Employee extends Person implements Player {
	
	private double salary;

	
	public Employee(String name, String lastName) {
		super(name, lastName);
		
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public void play() {
		
		System.out.println("EMPLEADO JUGANDO ");
	}
	

}
