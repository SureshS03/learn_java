package pkg1;

import pkg2.*;

public class A {

    protected String proString = "this is protected String";

    public static void main(String[] args) {
        
        C c = new C();

        //System.err.println(c.DefString); // The field C.DefString is not visible, beacuse defualt (no modifer) is only visbile inside the same package

        System.err.println(c.pubString);

        System.err.println(B.pubStringButDefClass); // work beacuse both are in same package

        B b = new B();

        //System.err.println(b.priString); // The field B.priString is not visible, priString has private access in B

    }
}


// NOTE
// public - access from anywhere, even in another package
// protected - only a subclass of the protected var class can access
// private - only access inside its own class itself, not even in same package can access it
// defualt - no modifyer can only access inside the package only

// static is static, no need for object to access it