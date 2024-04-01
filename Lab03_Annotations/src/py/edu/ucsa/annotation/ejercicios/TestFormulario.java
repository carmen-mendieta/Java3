package py.edu.ucsa.annotation.ejercicios;

@Form(titulo = "Prueba de formulario")
public class TestFormulario {

	@Visual(etiqueta = "Maria")
	private String nombre;

	@Visual(etiqueta = "Edad", editable = false)
	private int edad;

}
  