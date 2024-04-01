package py.edu.ucsa.ejer4.xml;

@XML(rootName = "persona")
public class Persona {
	@Tag(name = "nombre")
	private String nombres;
	@Tag(name = "apellidos")
	private String apellido;
	@Tag(name = "ci")
	private String nroCedula;
	@Tag(name = "direccion")
	private String direccion;
	@Attribute(name = "sexo")
	private String sexo;

	public Persona() {
		super();
	}

	public Persona(String nombres, String apellido, String nroCedula, String direccion, String sexo) {
		super();
		this.nombres = nombres;
		this.apellido = apellido;
		this.nroCedula = nroCedula;
		this.direccion = direccion;
		this.sexo = sexo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNroCedula() {
		return nroCedula;
	}

	public void setNroCedula(String nroCedula) {
		this.nroCedula = nroCedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
