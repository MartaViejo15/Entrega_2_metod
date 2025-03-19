package Ejercicio_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            // do something if no exception ...
            // you main logic here in the try-block
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            ex.printStackTrace(); // print the stack trace
        }
        /* Al poner el ex.printStackTrace() va a imprimir por pantalla el rastreo de pila,
        que corresponde con la secuencia de llamadas de métodos que han dado el error resultante.
         */
    }
}
