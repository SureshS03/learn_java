public class Varags {
    public static void main(String[] args) {
        
        // Varags are allow a method that can accpect x no of agurment,
        // it give more flexiblity to overcome the override method for all differenet agurements   
        System.out.println(adder(1,2,3,4));
        System.out.println(adder(1,2));

    }
    
    
    static int adder(int...numbs) {
        int res = 0;
        for (int x : numbs) {
            res += x;
        }
        return res;
    }
}