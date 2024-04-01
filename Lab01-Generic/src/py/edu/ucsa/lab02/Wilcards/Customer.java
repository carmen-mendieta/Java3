package py.edu.ucsa.lab02.Wilcards;

public class Customer extends Person implements Player {
	private double balance;

	public Customer() {
		super();
	}

	public Customer(String name, String lastName) {
		super(name, lastName);

	}

	public Customer(String name, String lastName, int balance) {
		super(name, lastName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void play() {
		System.out.println("JUGADOR CLIENTE, jugando ");

	}

}
