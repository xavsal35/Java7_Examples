package hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String version = System.getProperty("java.version");
	    int pos = 0, count = 0;
	    for ( ; pos<version.length() && count < 2; pos ++) {
	        if (version.charAt(pos) == '.') count ++;
	    }
		System.out.println("Hello you are in "+version.substring (0, pos));
	}

}
