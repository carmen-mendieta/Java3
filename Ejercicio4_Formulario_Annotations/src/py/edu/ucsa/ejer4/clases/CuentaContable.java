package py.edu.ucsa.ejer4.clases;

import java.time.LocalDate;

import py.edu.ucsa.ejer4.anotaciones.Form;
import py.edu.ucsa.ejer4.anotaciones.Visual;

@Form(titulo = "ABM DE CUENTAS")
public class CuentaContable {
		@Visual(etiqueta = "CODIGO: ", editable=true)
		private String nombre;
		

		@Visual(etiqueta = "NOMBRE CUENTA: ",editable=true)
		private String apellido;
		
		@Visual(etiqueta = "NRO. CI: ", editable=true)
		private String cedula;
		
		
		@Visual(etiqueta = "IMPUTABLE", editable=true)
		private boolean imputable= true;
		
		
		private String fechaNac=LocalDate.now().toString();
	
	
	}

