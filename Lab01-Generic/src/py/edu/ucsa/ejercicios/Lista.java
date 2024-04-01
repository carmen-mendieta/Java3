package py.edu.ucsa.ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lista<T> {

	private List<T> listaGenerica;

	public Lista() {
		this.listaGenerica = new ArrayList<>();
	}

	public Lista(List<T> lista) {
		this.listaGenerica = new ArrayList<>();
		this.listaGenerica.addAll(lista);
	}

	public void agregar(T elementoGenerico) {
		listaGenerica.add(elementoGenerico);

	}

	public T obtenerByIndice(int indice) {

		if (indice >= 0 && indice < listaGenerica.size()) {
			return this.listaGenerica.get(indice);
		} else {
			return null;
		}
	}

	public List<T> obtenerTodos() {
		return listaGenerica;

	}
}
