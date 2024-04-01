package py.edu.ucsa.lab03.Wilcards;

import java.util.Collection;
import java.util.Iterator;

public class WilcardsSubtipos {
	public static void printCollection(Collection<? super Employee> c) {
	 
	Iterator<? super Employee> it= c.iterator();	
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o.toString());
		}
	}

}

