package Ejercicio_7;

public class IllegalArgumentExceptionEjemplo {
    public static double raizCuadrada(double numero){
        if (numero < 0){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        return Math.sqrt(numero);
    }
    public static void main(String[] args) {
        try {
            double solucion = raizCuadrada(-4);
            System.out.println("La raíz es: " + solucion);
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException encontrada: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
