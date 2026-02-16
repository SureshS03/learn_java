
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        
        // Ternary is a small if else statement

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the num");
        int x = sc.nextInt();
        System.err.println(evenOrOdd(x));
        
        sc.close();

    }

    static String evenOrOdd(int x) {
        return (x % 2 == 0) ? "even" : "odd"; // check the statment and work like dart
    }

}   