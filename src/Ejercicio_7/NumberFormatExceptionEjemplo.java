package Ejercicio_7;

public class NumberFormatExceptionEjemplo {
    public static void main(String[] args) {
        String numeroNoValido = "abc";

        try {
            int numero = Integer.parseInt(numeroNoValido);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException encontrada: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Final del try");
        }
    }
}
