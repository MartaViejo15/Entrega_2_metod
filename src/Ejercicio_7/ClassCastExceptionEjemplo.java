package Ejercicio_7;

public class ClassCastExceptionEjemplo {
    public static void main(String[] args) {
        Object o = new Object();

        try {
            Integer i = (Integer) o;
            System.out.println("Número: " + i);
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException encontrada: " + ex);
            ex.printStackTrace();
        } finally {
            System.out.println("Fin del try");
        }
    }
}
