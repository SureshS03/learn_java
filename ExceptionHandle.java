import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {

        // exception is an event that occur that will distrup the program

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter 1st num to divide");
            int a = sc.nextInt();

            System.out.println("enter 2nd num to divide");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("res is " + c);
        } catch (ArithmeticException e) {
            System.out.println("bro you cant divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("bro enter only number");
        } catch (Exception e) {
            System.out.println("something is worng"); // using Exception is slow and not good, so always try to use the
                                                      // crt Exception
        } finally { // always do
            sc.close();
            System.err.println("Thank you bro...");
        }

    }
}
