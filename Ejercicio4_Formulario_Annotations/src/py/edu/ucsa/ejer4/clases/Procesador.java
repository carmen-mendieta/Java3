package py.edu.ucsa.ejer4.clases;

import java.awt.GridLayout;
import java.lang.reflect.Field;

import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import py.edu.ucsa.ejer4.anotaciones.Form;
import py.edu.ucsa.ejer4.anotaciones.Visual;

public class Procesador {

	public static JFrame procesar(Object o) {

		if (!o.getClass().isAnnotationPresent(Form.class)) {
			throw new IllegalArgumentException("La clase no esta anotada");
		}
		Form f = o.getClass().getAnnotation(Form.class);
		Field[] fields = o.getClass().getDeclaredFields();
		JFrame form = new JFrame(f.titulo());
		form.setLayout(new GridLayout(5, 2));

		for (Field field : fields) {
			if (field.isAnnotationPresent(Visual.class)) {
				Visual visual = field.getAnnotation(Visual.class);
				JLabel etiq = new JLabel(visual.etiqueta());
				form.getContentPane().add(etiq);
				if (field.getType().equals(boolean.class)) {
					JCheckBox box = new JCheckBox();
					box.setEnabled(visual.editable());
					try {
						field.setAccessible(true);
						box.setSelected((boolean)field.get(o));
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					form.getContentPane().add(box);
				} else {
					JTextField txt = new JTextField(25);
					txt.setEnabled(visual.editable());
					form.getContentPane().add(txt);
				}
			}
		}

		form.pack();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
		return form;

	}

}
