package py.edu.ucsa.ejer4.xml;

public class TestXML {
	public static void main(String[] args) {
		Persona p= new Persona();
		p.setSexo("Femenino");
		p.setNombres("Maria");
		p.setApellido("Mendieta");
		p.setNroCedula("1234");
		p.setDireccion("Ita");
		String XML=Procesador.procesar(p);
		System.out.println(XML);
	}

}
