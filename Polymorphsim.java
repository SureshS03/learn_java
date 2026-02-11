public class Polymorphsim {
  public static void main(String[] args) {
    // Polymorphsim is give the power to an object be as more then one type
    
    Car c = new Car();
    Bike b = new Bike();
    Scooty s = new Scooty();

    // if we want to store all these object in array means we cant
    // Car[] racers = {c,b,s} // error beacuse b and s are not Car classes

    // but we can use Vechicle to store all
    Vechicle[] racers = {c,b,s};
    // the above array is the polymorphsim because we did make a object act as more then one

    for (Vechicle x : racers) {
      x.go();
    }
  }
}

class Vechicle {
    public void go(){

    }
}

class Car extends Vechicle{
  @Override
  public void go() {
    System.out.println("car is going..");
  }
}

class Bike extends Vechicle{
  @Override
  public void go() {
    System.out.println("bike is going..");
  }
}

class Scooty extends Vechicle{
  @Override
  public void go() {
    System.out.println("scooty is going..");
  }
}
