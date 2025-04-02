package Ejercicio_5;

public class MethodC2 {
    public static void main(String[] args) throws XxxException, YyyException {
        MethodC2 m2 = new MethodC2();
        m2.methodC();
    }
    public void methodC() throws XxxException, YyyException {
        System.out.println("Enter methodC()");
        methodD(2);
        System.out.println("Exit methodC()");
    }
    public void methodD(int value) throws XxxException, YyyException { // method's signature
        // method's body
        System.out.println("Enter methodD() with value: " + value);

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
