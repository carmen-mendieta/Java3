package py.edu.ucsa.ejercicios;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.naming.directory.ModificationItem;

import py.edu.ucsa.lab02.Wilcards.Customer;
import py.edu.ucsa.lab02.Wilcards.Employee;

public class TestReflection {

	public static void main(String[] args) {
		// Class<?> tipo= Employee.class; 1ra. forma
		// Employee emp = new Employee();
		// Class<?> tipo= emp.getClass(); 2da. forma

		Class<?> tipo;
		try {
			tipo = Class.forName("py.edu.ucsa.lab02.Wilcards.Person");
			System.out.println(tipo.getName());
			System.out.println(tipo.getSimpleName());
			System.out.println(tipo.getCanonicalName());
			System.out.println(tipo.getModifiers());
			System.out.println(Modifier.isFinal(tipo.getModifiers()));

		} catch (Exception e) {
			// TODO: handle exception
		}
 
		// Class<?> c= Customer.class;
		Customer cli = new Customer("JOSE", "BENITEZ");

		Class<?> c = cli.getClass();
		Method m;

		try {
			m = c.getMethod("getName", new Class[0]);
			System.out.println(m.invoke(cli));

			Class[] params = { String.class };
			
			m = c.getMethod("setName", params);
			m.invoke(cli, "Francis");

			m = c.getMethod("getName", new Class[0]);
			System.out.println(m.invoke(cli));

			m = c.getMethod("play", new Class[0]);
			System.out.println(m.invoke(cli));

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
			// TODO: handle exception
		}
		
		Class<?> cl;
		try {
			
			cl= Class.forName("java.lang.String");
			Method mtds[]=cl.getDeclaredMethods();
			for(int i=0; i<mtds.length;i++) System.out.println(mtds[i].toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
