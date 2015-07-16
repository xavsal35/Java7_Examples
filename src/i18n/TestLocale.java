package i18n;

//import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {

	public static void main(String[] args) throws Exception {

		ResourceBundle bundle1 = ResourceBundle.getBundle("resources.i18n.TestBundle");
		displayValues(bundle1);

		/*Locale defaultLocale = Locale.getDefault();
		ResourceBundle bundle2 = ResourceBundle.getBundle("resources.i18n.TestBundle", defaultLocale);
		displayValues(bundle2);

		Locale swedishLocale = new Locale("sv", "SE");
		ResourceBundle bundle3 = ResourceBundle.getBundle("resources.i18n.TestBundle", swedishLocale);
		displayValues(bundle3);

		Locale spanishLocale = new Locale("es", "ES");

		ResourceBundle bundle4 = ResourceBundle.getBundle("resources.i18n.TestBundle", spanishLocale);
		displayValues(bundle4);
		*/
	}

	public static void displayValues(ResourceBundle bundle) {
		System.out.println("hello message:" + bundle.getString("my.hello"));
		System.out.println("goodbye message:" + bundle.getString("my.goodbye"));
		System.out.println("question message:" + bundle.getString("my.question"));
	}
}