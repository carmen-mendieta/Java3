package py.edu.ucsa.lab03.Wilcards;

import java.util.Collection;

public class MetodosGenericos {
	static <T> void fromArrayToCollection(T[] a, Collection <T> c) {
		for(T o :a) {
		c.add(o);
		System.out.println(o);
		 
		}
	}

}
