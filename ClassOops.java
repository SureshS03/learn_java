import java.util.Scanner;

public class ClassOops { //only nested class can be static
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.err.println("What is your name?");
            name = s.nextLine();
        }

        System.err.println("Hello "+ name);
        s.close();

        forLoop(10); // accessable by anywhere
        TestforLoop(5); // only accessable inside this package
        test(); //cant access in another class via object of this class itself

        ClassOops l = new ClassOops();
        @SuppressWarnings("unused")
        ClassOops.BroClass b = l.new BroClass(10);

        l.printer("suresh");

    }

    class BroClass { // this is non static class, so its need object to access, use things like this when a nested class need to access the parent object data

        @SuppressWarnings("unused")
        int num;
        public BroClass(int num) {
            this.num = num;
        }

    }
    //by using static class we can dircet access the class without the parnet object

    public static void forLoop(int num) { //public static func can be used in the class and without the object(no need of creating object) eg Math.max() 
        for(int i = 0; i<= num; i++){
            System.err.println(i);
        }
    }

    static void TestforLoop(int num) { //the diff between public static void func and static void func is, public static func can be acessable by another packages(another folder) only static cant be accessable
        for(int i = 0; i<= num; i++){
            System.err.println(i);
        }
    }

    public void printer(String name) { //static func can be used in the class and without the object(no need of creating object) eg Math.max() 
        System.err.println(name);
    }

    private static void test() { // private fun only can use inside the this class only, even object of this class cant access it
        System.out.println("Testing");
    }

}
