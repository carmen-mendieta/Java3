package py.edu.ucsa.lab02.Wilcards;

import java.util.ArrayList;
import java.util.Collection;

public class TetWilcardsSubtipos {
	public static void main(String[] args) {
		/*
		 * Collection<Person> collection= new ArrayList<>(); collection.add(new
		 * Customer("GUSTAVO", "MARTINEZ",3000000)); collection.add(new
		 * Customer("NARCISO", "AÑAZCO",3000000)); collection.add(new Customer("FANNY",
		 * "RIVAS",3000000)); collection.add(new Customer("LUIS", "MARTINEZ",3000000));
		 * 
		 * WilcardsSubtipos.printCollection(collection);
		 */
		Collection<Player> x = new ArrayList<>();
		x.add(new Customer("MIGUEL", "MORA"));
		x.add(new Customer("MARIA DEL CARMEN", "RAMIREZ"));
		WilcardsSubtipos.printCollection(x);
	}

}
