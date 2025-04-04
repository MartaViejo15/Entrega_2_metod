package Ejercicio_5;

public class MethodD {
    public static void main(String[] args) throws XxxException, YyyException {
        MethodD obj = new MethodD();
        obj.methodD();}

    public void methodD() throws XxxException, YyyException { // method's signature
        // method's body
        int value = 10;

        // XxxException occurs
        if (value > 5) {
            throw new XxxException("Error: Valor demasiado grande (" + value + ")"); // construct an XxxException object and throw to JVM
        }
        // YyyException occurs
        if (value < 0){
            throw new YyyException("Error: Valor negativo no permitido (" + value + ")"); // construct an YyyException object and throw to JVM
        }
        System.out.println("El valor" + value + "es válido");
    }

}
