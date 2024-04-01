package py.edu.ucsa.lab03.annotations.ejemplos.ej3;

public class Procesador {
	public static void main(String[] args) {
		boolean isBeta = SomeClass.class.isAnnotationPresent(BetaVersion.class);
		System.out.println("ESTA ANOTADA CON LA ANOTACION BetaVersion?:" + isBeta);

		if (SomeClass.class.isAnnotationPresent(Copyright.class)) {
			String copyrigth = SomeClass.class.getAnnotation(Copyright.class).value();
			System.out.println(copyrigth);
		}
	}
}
