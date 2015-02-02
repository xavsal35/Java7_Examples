package bufferedstreams;

import java.io.*;

public class TestBufferedStreams {

    public static void main(String[] args) {

        //  Estructura del try-with-resources del Java 7
        //  Se preparan los dos buffers de escritura y lectura.
        try (BufferedReader bufInput = new BufferedReader(new FileReader("bufferedstreams\\file1.txt"));
             BufferedWriter bufOutput = new BufferedWriter(new FileWriter("bufferedstreams\\file2.txt"))){
                                
            //  Lectura de una linea del lector
            String line = bufInput.readLine();
            
            //  Mientras haya linias en el buffer de entrada
            while (line != null) {
               
                //  Se escribe la linea actual en el buffer de salida
                bufOutput.write(line, 0, line.length());
                //  Creación de una nueva línea
                bufOutput.newLine();           
                //  Se lee la siguiente línea
                line = bufInput.readLine();                
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}












