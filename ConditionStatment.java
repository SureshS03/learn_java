
import java.util.Scanner;

//static func are for the class, non static func are for the object
public class ConditionStatment {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age:- ");
        age = s.nextInt();

        s.close();

        if (age >= 18 && age < 30) {
            System.out.println("Your an adult");
        } 
        else if (age >= 30) {
            System.err.println("Your Unc");
        }
        else {
            System.err.println("What are you child?");
        }

        ConditionStatment c = new ConditionStatment();
        c.switchStatment("Suresh");

    }

    public void switchStatment(String name) {

        switch(name) {
            case "Suresh": 
                System.err.println("Hello boss");
                System.err.println(name);
                break;
            case "Arya":
                System.err.println("Hello Dev");
                System.err.println(name);
            default:
                System.err.println("Who are You??");
                break;
        }
    }

}