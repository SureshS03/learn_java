public class Abstractions {
    public static void main(String[] args) {
        
        // Abstartions - abstract can be class or methoed
        // abstarct class cant be instantiated but they can hev sub class that can be instantiated
        // abstarct method are declared without an implementation

        //V v = new V(); // V is abstract; cannot be instantiated
        Car car = new Car();
        car.go(); // good to go...

    }
}

// this modifyer abstract give a sercuity layer like no one can create a Object of V like V var = new V(); beacuse its abstract
abstract class V {

    abstract void go(); // this is abstract method it cant have body but the subclass of this class, should have this method implementation

}

// but this is sub class of V so it can be used via object 
class Car extends V {

    // override and satify the abstract class
    @Override
    void go(){
        System.err.println("going...");
    }

}