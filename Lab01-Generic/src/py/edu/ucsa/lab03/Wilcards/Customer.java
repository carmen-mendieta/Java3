package py.edu.ucsa.lab03.Wilcards;

import py.edu.ucsa.lab02.Wilcards.Person;

public class Customer extends Person {

	private double balance;

	public Customer(String name, String lastName,double balance) {
		super(name, lastName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
