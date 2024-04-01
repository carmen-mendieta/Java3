package py.edu.ucsa.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class TestPersona {

	public static void main(String[] args) {
		
		
      //Lista para agregar por cada elemento 
		/* 
		 * Lista<Gerente> listaGerentes = new Lista<>( ); listaGerentes.agregar(new
		 * Gerente("Maria", "Mendieta"));
		 * System.out.println(listaGerentes.obtenerByIndice(0));
		 */
		
		
	      //Lista para agregar mediante una lista s
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("Ariel", "Ayala"));
		empleados.add(new Empleado("Ariel", "Mendieta"));
	    Lista<Empleado> listTestEmpleados = new Lista<>(empleados);
		 System.out.println(listTestEmpleados.obtenerByIndice(1));
		
		listTestEmpleados.agregar(new Empleado("Maria", "Mendieta"));
		
		System.out.println(listTestEmpleados.obtenerTodos());

	}

}
