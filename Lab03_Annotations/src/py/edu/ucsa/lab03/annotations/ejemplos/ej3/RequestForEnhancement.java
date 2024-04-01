package py.edu.ucsa.lab03.annotations.ejemplos.ej3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RequestForEnhancement {
	int id();

	String synopsis();

	String engineer() default "[unnasigned]";

	String date() default "[unimplemented]";

}
