import java.util.Scanner;

public class EnumsClass {
    public static void main(String[] args) {

        // Enums (Enumeration) are speical classes that hold a set of user created
        // Constants
        // it helps in readability and maintain
        // mostly used in swtich case rather the comparing string

        Day d = Day.SATURADY; // no need for new keyword, we arnt creating object here

        System.err.println(d); // this will print Sat
        System.out.println(d.whtday()); // this will print 7, beacsue when we create Day d, it will call the constructor
                                        // and pass the value of sat to the variable

        switch (d) {
            // we dont use string here, we use enum this will improve the speed of the
            // program
            case MONDAY, TUESDAY, WENDESDAY, THRUSDAY, FRIDAY -> System.out.println("Its week day broo");
            case SATURADY, SUNDAY -> System.out.println("Its weekend broo");
        }

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toUpperCase();

        Day d2 = Day.valueOf(s); // valueof is the default class method that take string or generics and retrun the approritiarte Enum constant value to construstor
        // and the string must match the type case of the enums constants so use uppercase is best, if not means it will throw illegalAgurumentsExpectoin

        sc.close();

    }  
}

enum Day {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WENDESDAY(4), THRUSDAY(5), FRIDAY(6), SATURADY(7);
    // whenever we use these above constant value a day construstor called and pass
    // the value to the variable for that Day

    private final int daynum;

    Day(int daynum) {
        this.daynum = daynum;
    }

    // getter
    int whtday() {
        return this.daynum;
    }
}