package Ejercicio_5;

public class MethodD {
    public static void main(String[] args) {}
    public void methodD() throws XxxException, YyyException { // method's signature
        // method's body
 ...
 ...
        // XxxException occurs
        if ( ... )
        throw new XxxException(...); // construct an XxxException object and throw to JVM
 ...
        // YyyException occurs
        if ( ... )
        throw new YyyException(...); // construct an YyyException object and throw to JVM
 ...
    }

}
