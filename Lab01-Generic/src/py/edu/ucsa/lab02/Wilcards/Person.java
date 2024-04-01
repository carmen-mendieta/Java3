package py.edu.ucsa.lab02.Wilcards;

public class Person {
	private String name;
	private String lastName;

	public Person() {
		super();
	}

	public Person(String name, String lastName) {
	
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
