package py.edu.ucsa.ejer4.xml;

import java.lang.reflect.Field;

import py.edu.ucsa.ejer4.anotaciones.Form;
import py.edu.ucsa.ejer4.anotaciones.Visual;

public class Procesador {
	public static String procesar(Object o) {
		if (!o.getClass().isAnnotationPresent(XML.class)) {
			throw new IllegalArgumentException("La clase no esta anotada");
		}

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		XML claseXML = o.getClass().getAnnotation(XML.class);
		sb.append("<" + claseXML.rootName() + " ");
		Field[] fields = o.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Attribute.class)) {
				Attribute att = field.getAnnotation(Attribute.class);
				try {
					sb.append(att.name()+"=\""+field.get(o)+"\"");
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 
			}
			
			if (field.isAnnotationPresent(Tag.class)) {
				Tag tag = field.getAnnotation(Tag.class);
				try {
					sb1.append("\t<"+tag.name()+"=\""+field.get(o)+"\">\n");
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 
				
			}
		}
		sb.append(">\n");
		sb.append(sb1.toString());
		return sb.toString();

	}

}
