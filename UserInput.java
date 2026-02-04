
import java.util.Scanner;


public class UserInput {   

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //scanner is a class, which take a InputStream as agrs
        System.out.println("Enter your name");
        String name = s.nextLine(); // take next line
        System.out.println("hello "+ name);

        System.out.println("ur age");
        int age = s.nextInt(); // take int only
        System.out.println("ur age is" + age);

        System.out.println("enter your fav thing");
        String fav = s.nextLine(); //THIS WILL NOT WORK, beacuse the preivous nextInt() will not read the \n in the scanner
        // so the '\n' will remain at the sacnner so while using it again, it will skip the input and take old \n 
        System.out.println("fav is "+ fav); //to solve this use the nextLine once again to take the \n and empty the scanner
        s.nextLine(); //no need to store beacuse no need of \n

        s.close(); //close the scanner for no memory leak
        System.out.println("enter anything");
        String anything = s.nextLine(); // this will not work and throw error beacsue scanner is closed
        System.out.println(anything); //
    }
    
}
