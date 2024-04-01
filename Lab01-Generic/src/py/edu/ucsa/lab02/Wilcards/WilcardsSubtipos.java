package py.edu.ucsa.lab02.Wilcards;

import java.util.Collection;
import java.util.Iterator;

public class WilcardsSubtipos {
	public static void printCollection(Collection<? extends Player> c) {
		Iterator<? extends Player> it = c.iterator();
		while (it.hasNext()) {
			Player p = it.next();
			p.play();
		}
	}

}
