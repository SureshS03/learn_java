public class Printf {
    public static void main(String[] args) {
        
        //printf() is a method to control and format the text for print 
        // it have two agurs string, value/varibale/object
        // % [flags] [precision] [width] [conversion-character]

        int Myint = 10;
        double Mydouble = 100.8734;
        String MyString = "suresh";
        boolean Myboolean = true;
        char Mychar = '@';

        // conversion characters
        System.out.printf("%d\n", Myint);
        System.out.printf("%f\n", Mydouble);
        System.out.printf("%s\n", MyString);
        System.out.printf("%b\n", Myboolean);
        System.out.printf("%c\n", Mychar);

        // width
        //width is min number of character to display
        System.out.printf("hello %10s\n", MyString); // this will display 10 (4 space + suresh[6 letters])

        // precision
        // set a number of digits in floating value like double or float
        System.out.printf("money is %10.2f\n", Mydouble); //leave 10 space and only display 2 digits after point 100.87

        // flags
        // give some effects in output
        // - :- give left hand side space
        // (+) or (-) :- can add + or - value in output in numberic datas
        // 0 :- can add 0 around the value
        // , :- add come in larger number > 1000

        System.out.printf("%,d\n", 100000); // 100,000
        System.out.printf("%+d\n", 100000); // +100000
        System.out.printf("%+d\n", -100000); //-100000
        System.out.printf("%010d\n", 100000); //[0000]100000 (4 + 6 = 10)
        System.out.printf("test %-10d\n", 100000); //test 100000____ (4 white spaces)

    }
}
