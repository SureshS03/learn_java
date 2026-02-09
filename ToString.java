public class ToString {
    public static void main(String[] args) {

        // the default toString method only give address of the object, but by override the func, we can modfiy it
        Human h = new Human();

        System.out.println(h.toString()); //calling directly
        System.err.println(h); //calling in directly, works beacuse of override

    }
}

class Human {
    String name = "suresh";
    int age = 21;
    String clg = "dr.m.g.r";

    @Override
    public String toString() {
        return name + " " + age + " " + clg;
    }
}