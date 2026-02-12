
import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args) {

        // DynamicPolymorphism is a normal polymorphsim but the dynamic means we can
        // create a object in runtime
        // like a BWM can be BMW, vechial, Car, and a object etc...
        // so via a polymorphsim can be use a common class and spefic the needed object
        // in run time that what means dynamic

        Animal animal; // now this can be cat or dog

        Scanner sc = new Scanner(System.in);
        System.err.println("What Animal u like???");
        System.err.println();
        System.err.println("1 for cat\n2 for dog");
        int res = sc.nextInt();

        if (res == 1) {
            animal = new Cat(); // this will create a object of cat in runtime (dynamic)
            System.out.println(animal);
            animal.speak();
        } else if (res == 2) {
            animal = new Dog();
            System.out.println(animal);
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }

        sc.close();

    }
}

class Animal {
    void speak() {
        System.err.println("Animal goes xxx");
    }
}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Dog goes bark");
    }
}

class Cat extends Animal {

    @Override
    void speak() {
        System.err.println("Cat goes meow");
    }
}