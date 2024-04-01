package py.edu.ucsa.lab03.annotations.ejemplos.ej3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Copyright {
	String value();

}
