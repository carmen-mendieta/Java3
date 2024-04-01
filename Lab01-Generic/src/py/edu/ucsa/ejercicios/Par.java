package py.edu.ucsa.ejercicios;

public class Par<T, P> {
	private T primerElemento;
	private P segundoElemento;

	public Par(T primerElemento, P segundoElemento) {
		super();
		this.primerElemento = primerElemento;
		this.segundoElemento = segundoElemento;
	}

	public T getPrimerElemento() {
		return primerElemento;
	}

	public void setPrimerElemento(T primerElemento) {
		this.primerElemento = primerElemento;
	}

	public P getSegundoElemento() {
		return segundoElemento;
	}

	public void setSegundoElemento(P segundoElemento) {
		this.segundoElemento = segundoElemento;
	}

}
