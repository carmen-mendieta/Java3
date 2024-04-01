package py.edu.ucsa.lab03.annotations.ejemplos.ej3;

import java.sql.Date;

@RequestForEnhancement(id = 232323, synopsis = "Enable time-travel", engineer = "Mr. Peabody", date = "4/01/3007")

public class TestAnnotations {
	public static void main(String[] args) {

		RequestForEnhancement antx = TestAnnotations.class.getAnnotation(RequestForEnhancement.class);
		System.out.println(antx.engineer());
		System.out.println(antx.synopsis());
	}



	public static void travelThroughTime(Date destination) {

	}

}
