package bufferedstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharactersStreams {

    public static void main(String[] args) {
        
        //  Try-with-resources para buffers de lectura/escritura de ficheros
        try (FileReader input = new FileReader("bufferedstreams\\file1_chars.txt");
                FileWriter output = new FileWriter("bufferedstreams\\file2_chars.txt")) {

            //  Lectura de chars des del buffer de entrada
            int charsRead;

            //  Todos los caracteres leídos     
            while ((charsRead = input.read()) != -1) {
                
                //  Se escriben los caracteres al buffer de salida...
                output.write(charsRead);
            }

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}









