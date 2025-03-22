package Ejercicio_3;

public class MethodCallStackWithD {
    public static void main(String[] args) {
        try{
            methodA();
        } catch (XxxException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static void methodA() throws XxxException {
        try {
            methodB();
        } catch (XxxException e) {
            System.out.println("Exception: " + e.getMessage());
            throw e;
        }
    }
    public static void methodB() throws XxxException {
        methodC();
    }
    public static void methodC() throws XxxException {
        methodD();
    }
    public static void methodD() throws XxxException {
        throw new XxxException("Error en methodD()");
    }
}
