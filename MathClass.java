import java.util.Scanner;


public class MathClass {
    public static void main(String[] args) {
        
        double x, y, z;
        Scanner s = new Scanner(System.in);


        System.out.println("Enter X side: ");
        x = s.nextDouble();

        System.out.println("Enter y side: ");
        y = s.nextDouble();

        z = Math.sqrt((x * x) + (y*y));

        System.out.println("Hypo is "+ z);

        s.close();

    }
}
