package Ejercicio_8;

public class Contraseña {
    public static void Contraseña(String contra) throws ContraseñaExcepción {
        if (contra != "9876matecompu#") {
            throw (new ContraseñaExcepción(contra));
        }
    }

    public static void main(String[] args) {
        try {
            Contraseña("Hola Antonio");
            Contraseña("9876matecompu#");
        } catch (ContraseñaExcepción ex) {
            System.out.println("ContraseñaExcepción encontrada: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
