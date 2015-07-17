package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocaleI18N {

	/* 
	La carga del ResourceBundle puede hacerse des de fichero, des del contexto de una aplicación, 
	des del propio entorno en el que se esté ejecutando esta clase Java.
	
	En este caso de ejemplo se utiliza el acceso al fichero properties ubicado dentro 
	del mismo paquete que la clase principal. 
	En un futuro, se realizaran pruebas con	el resto de mecanismos de acceso.   
	*/
	public static void main(String[] args) throws Exception {

		ResourceBundle bundle1 = ResourceBundle.getBundle("i18n.TestResourceBundle");
		visualizar(bundle1, null);

		Locale deLocale = Locale.getDefault();
		ResourceBundle bundle2 = ResourceBundle.getBundle("i18n.TestResourceBundle", deLocale);
		visualizar(bundle2, deLocale);

		Locale swLocale = new Locale("sv", "SE");
		ResourceBundle bundle3 = ResourceBundle.getBundle("i18n.TestResourceBundle", swLocale);
		visualizar(bundle3, swLocale);

		Locale spLocale = new Locale("es", "ES");
		ResourceBundle bundle4 = ResourceBundle.getBundle("i18n.TestResourceBundle", spLocale);
		visualizar(bundle4, spLocale);
		
		Locale enLocale = new Locale("en", "US");
		ResourceBundle bundle5 = ResourceBundle.getBundle("i18n.TestResourceBundle", enLocale);
		visualizar(bundle5, enLocale);
		
	}

	public static void visualizar(ResourceBundle bundle, Locale lo) {
		if(lo == null) { lo = Locale.getDefault();}
		System.out.println("Idioma: "+lo.getLanguage()); 
		System.out.println(".........................................................");
		System.out.println("Contenido Mensaje -->hello: " +" "+ bundle.getString("my.hello"));
		System.out.println("Contenido Mensaje -->goodbye: " +" "+ bundle.getString("my.goodbye"));
		System.out.println("Contenido Mensaje -->question: " +" "+ bundle.getString("my.question"));
		System.out.println("=========================================================");
	}
}