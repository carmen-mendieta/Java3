package py.edu.ucsa.lab01.wilcars;

import java.util.Collection;
import java.util.Iterator;

public class EjemploWilcard1 {

	   static void printCollection(Collection<?> c) {

		Iterator it = c.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}
}