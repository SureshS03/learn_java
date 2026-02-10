public class InterfaceCode {
  public static void main(String[] args) {
     
    // interfacce is a template that can implemented to class, that will spefivy what class have and must have
    // classess cana apply to more than one Interface
    
    Goat goat = new Goat();
    goat.run();

    Lion lion = new Lion();
    lion.hunt();

    Fox fox = new Fox();
    fox.run();
    fox.hunt();

  }
}
interface Hunter {
  public void hunt();
}
interface Prey {
  public void run();
}

class Lion implements Hunter {
  public void hunt() {
    System.out.println("lion hunt the Prey...");
  }
}

class Goat implements Prey{
  public void run() {
    System.out.println("Goat is running beacuse of Hunter");
  }
}

class Fox implements Hunter, Prey {

  public void run() {
    System.out.println("Fox is running beacuse of hunting lion");
  }

  public void hunt() {
    System.out.println("Fox hunting the goat");
  }
}
