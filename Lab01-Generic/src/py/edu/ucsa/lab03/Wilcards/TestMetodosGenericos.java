package py.edu.ucsa.lab03.Wilcards;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;

public class TestMetodosGenericos {
	public static void main(String[] args) {
		Person[] personas= new Person[5];
		personas[0]= new Person("JUAN", "PANIAGUA");
		personas[1]= new Person("JAVIER", "PANIAGUA");
		Collection<Person> destino= new ArrayList<>();
	MetodosGenericos.fromArrayToCollection(personas,destino);
	}

}
