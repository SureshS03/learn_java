public class Encapsulation {
    public static void main(String[] args) {

        Car c = new Car("BMW", "720d", 2020);

        // access the private varibales via getters
        System.out.println(c.getCompany());
        System.out.println(c.getModel());
        System.out.println(c.getYear());

        // change the private var via setters
        c.setYear(2022);

        System.out.println("year after changed " + c.getYear());
    }
}

class Car {

    private String company;
    private String model;
    private int year;

    Car(String company, String model, int year) {
        this.setCompany(company); // this method do the same work as constructor so why writing two things
        this.setModel(model);
        this.setYear(year);
    }

    // getters
    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setters
    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
