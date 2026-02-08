public class OverRideMethod {
    public static void main(String[] args) {

        //Overide methods in java is, a method or func having same name but diff parameters or diff parameters data type
        //every method have method signature which is method name + method parameters

        int x, y, z;
        x = 50;
        y = 40;
        z = 10;
        
        System.out.println(add(x, y));
        System.out.println(add(x, y, z));
        System.out.println(add(45.5, 55.5));

    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static double add(double  x, double  y) {
        return x + y;
    }

    static int add(int x, int y, double  z) {
        return x + y;
    }

    static int add(int x, double  y, int  z) {
        return (int) (x + y);
    }
}
