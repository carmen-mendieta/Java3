package py.edu.ucsa.lab01.wilcars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class TestWildcards {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList();
		c.add("Modulo 3"); // String
		c.add("Modulo 4"); // String
		// c.add(new BigDecimal(20000.72));// Big decimal
		// c.add(new BigDecimal(120000));// Big decimal
		// c.add(new file("c:/java"));
		EjemploWilcard1.printCollection(c);

	}

}
