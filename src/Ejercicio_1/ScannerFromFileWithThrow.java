package Ejercicio_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
        // to be handled by next higher-level method
        Scanner in = new Scanner(new File("test.in"));
        // this method may throw FileNotFoundException
        // main logic here ...
    }
    /* Al declarar el throws FileNotFoundException, lo que hacemos es que la excepción
    se lance hacia arriba en la pila de llamadas y la maneja el metodo superior,
    en este caso la Java Virtual Machine (JVM).
     */
}

