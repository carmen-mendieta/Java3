package py.edu.ucsa.ejer4.clases;

import py.edu.ucsa.ejer4.anotaciones.Form;
import py.edu.ucsa.ejer4.anotaciones.Visual;

@Form(titulo = "Formulario")
public class Persona {
	@Visual(etiqueta = "Nombre: ", editable=true)
	private String nombre;
	

	@Visual(etiqueta = "Apellido: ",editable=true)
	private String apellido;
	
	@Visual(etiqueta = "Cedula de identidad: ", editable=true)
	private String cedula;
	
	
	@Visual(etiqueta = "Femenino", editable=true)
	private boolean sexo1=true;
	
	
	@Visual(etiqueta = "Masculino", editable=true)
	private boolean sexo2=true;
	
	
	private int edad;
	
}
