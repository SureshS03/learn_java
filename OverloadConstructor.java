public class OverloadConstructor {
    public static void main(String[] args) {

        //overload constructor is same as override method, same name of constructor but with diff parameters

        Pizza defalutPizza = new Pizza(67.89);
        Pizza FavouredPizza = new Pizza(80.32, "Mexican");
        Pizza AllPizza = new Pizza(100.23, "Sweat Chilly", "itilan bread", "tomoto");

        //can even create null pizza
        @SuppressWarnings("unused")
        Pizza nullPizza = new Pizza();

        defalutPizza.sayPizza();
        FavouredPizza.sayPizza();
        AllPizza.sayPizza();

    }
}

class Pizza {

    double rate;
    String favour;
    String bread;
    String sause;

    public Pizza() {
        System.err.println("Null pizza here");
    }


    public Pizza(double rate) {
        System.out.println("Defualt pizza here");
        this.rate = rate;
    }

    public Pizza(double rate, String favour) {
        System.err.println("Favoured pizza here");
        this.rate = rate;
        this.favour = favour;
    }

    public Pizza(double rate, String favour, String bread) {
        System.err.println("Diff bread and favoured pizza here");
        this.rate = rate;
        this.favour = favour;
        this.bread = bread;
    }

    public Pizza(double rate, String favour, String bread, String sause) {
        System.err.println("Diff bread, favoured and sause pizza here");
        this.rate = rate;
        this.favour = favour;
        this.bread = bread;
        this.sause = sause;
    }

    void sayPizza() {
        System.err.printf("Pizza!! %f %s %s %s\n", rate, favour, bread, sause);
    }
    

}
