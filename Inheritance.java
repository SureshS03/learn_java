public class Inheritance {

    public static void main(String[] args) {
        
        // inheritance, is the process where a class can access the attributes and methods from another class

        Car car = new Car(20.00, 4);
        //Bike bike = new Bike();

        car.go(); //use the car class go func not vechile class go //override
        car.stop();
        //bike.go();

        //car.speed = 10.00;
        //bike.speed = 5.00;

        System.err.println(car.speed); // each child class has its own paranet class object
        //System.err.println(bike.speed);
    }
    
}

//if the super class have constructor means, child also should have that with the super keyword with the variable of super class
//and if the child class have the same method has super class means, it will do in child class
// this is paranet class AKA Super class
class Vechicle {

    double speed;

    public Vechicle(double speed) {
        this.speed = speed;
    }

    void go(){
        System.err.println("This vechile is moving...");
    }

    void stop(){
        System.err.println("This vechile is stopped");
    }

}

// this is subclass of Vechile AKA child class
class Car extends Vechicle{

    int wheels;

    public Car(double speed, int wheels) {
        super(speed); // this super will call the super class constructor and pass the value
        this.wheels = wheels;
    }

    @Override
    void go(){
        System.err.println("car is going...");
    }

}

// this is subclass of Vechile AKA child class
//class Bike extends Vechicle{

//}
