package pkg2;

import pkg1.A;
//import pkg1.B; //B is not public in pkg1; cannot be accessed from outside package (error)

public class D extends A{

    public static void main(String[] args) {

        C c = new C();
        System.err.println(c.defString); // can access the defualt no modifer, beacsue both are in same package

        //B b = new B(); // B is not public in pkg1; cannot be accessed from outside package
        // even the var inside the class is static but cant asscess it

        D d = new D();
        System.err.println(d.proString); // d is sub class of A so it can access the protected varibales
        
    }
    
}
