package Ejercicio_7;

public class NullPointerExceptionEjemplo {
    public static void main(String[] args) {
        String[] strs = new String[3];

        try {
            System.out.println("Longitud de strs[0]: " + strs[0].length());
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException encontrada: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Final del try");
        }
    }
}
