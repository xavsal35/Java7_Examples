/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconsolemanagement;

/**
 *
 * @author XSalvador
 */ 
public class EchoNumberConversion {

    public static void main(String[] args) {

        int primerArg;

        System.out.println("Conversión de ficheros de tipo Int des de consola de comandos");
        if (args.length > 0) {

            try {

                primerArg = Integer.parseInt(args[0]);
                System.out.println("Se ha convertido la cadena " + args[0] + " en el número siguiente -> " + primerArg);

            } catch (NumberFormatException e) {

                System.err.println("Argumento " + args[0] + " debe ser un número entero.");
                System.err.println("Error: "+e.getMessage());
                System.exit(1);

            }

        }
    }
}
