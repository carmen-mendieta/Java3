package py.edu.ucsa.ejer4.clases;

import py.edu.ucsa.ejer4.anotaciones.Form;
import py.edu.ucsa.ejer4.anotaciones.Visual;


@Form(titulo = "Curso")
public class Curso {

	@Visual(etiqueta = "Materia: ", editable=true)
	private String materia;
	

	@Visual(etiqueta = "Nivel: ", editable=true)
	private String nivel;
	
	@Visual(etiqueta = "año_curso", editable=true)
	private String anho;
	
	private int cant_alumnos;
	
}
