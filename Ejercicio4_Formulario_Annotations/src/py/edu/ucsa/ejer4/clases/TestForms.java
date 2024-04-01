package py.edu.ucsa.ejer4.clases;

import javax.swing.JFrame;

public class TestForms {
	public static void main(String[] args) {
		Persona p = new Persona();
		JFrame ventana = Procesador.procesar(p);
		Curso c = new Curso();
	//	Procesador.procesar(c);
		CuentaContable cc= new CuentaContable();
		//Procesador.procesar(cc);
	}

}
