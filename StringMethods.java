public class StringMethods {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name = "Suresh";

        boolean res;
        res = name.equals("Suresh"); //ture
        res = name.equalsIgnoreCase("surEsH"); //ture
        char resChar = name.charAt(3); //e
        int resInt = name.indexOf("r"); //2
        res = name.isEmpty(); //false
        String resString = name.toUpperCase(); //SURESH 
        resString = name.trim(); // remove all empty space
        resString = name.replace("S", "z"); //zuresh

        System.out.println(resString);
    }
}
