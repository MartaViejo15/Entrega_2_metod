package Ejercicio_5;

public class MethodC1 {
    public static void main(String[] args) {
        MethodC1 m1 = new MethodC1();
        m1.methodC();
    }

    public void methodC() { // no exception declared
        System.out.println("Enter methodC()");
        try {
            // uses methodD() which declares XxxException & YyyException
            methodD();
        } catch (XxxException ex) {
            // Exception handler for XxxException
            System.out.println("XxxException: " + ex.getMessage());
        } catch (YyyException ex) {
            // Exception handler for YyyException
        System.out.println("YyyException: " + ex.getMessage());
        } finally { // optional
            // These codes always run, used for cleaning up
            System.out.println("Finally del methodC()");
        }
        System.out.println("Exit methodC()");
    }

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
