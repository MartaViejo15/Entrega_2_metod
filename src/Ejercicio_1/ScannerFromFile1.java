package Ejercicio_1;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ScannerFromFile1 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("test.in"));
            // do something ...
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        } finally {
            System.out.println("Scanner finished");
        }
    }
        /* Al usar un try-catch le pedimos que pruebe lo del try y en caso de dar error
        que imprima por pantalla el FileNotFoundException, que es lo que dice el catch,
        y al añadirle un finally le decimos que siempre imprima el string "Scanner finished"
         */
}

