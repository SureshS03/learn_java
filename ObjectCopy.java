public class ObejctCopy {
    public static void main(String[] args) {

      Car c1 = new Car("BMW", "720d", 2022); //Car@5606c0b
      Car c2 = new Car("Benz", "400", 2020); //Car@80ec1f8
      // the above address are the address of the those object, change everytime run                                           

      //c2 = c1; // this will copy the address of the c1 to c2, so the c1 and c2 have same address, so if we change in c1 means it will also change in c2
               // to avoid this we can create a copy method in our class 
      
      c2.copy(c1); // this will do the copy job, by using the getMethods from c1 and use the setMethods from c2 to set the value
                   // and maintain the two different address
 
      Car c3 = new Car(c1); // this will create a new object with new address

      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3); // different address then c1
      System.out.println(c1.getModel());
      System.out.println(c1.getCompany());
      System.out.println(c1.getYear());

      System.out.println();

      System.out.println(c2.getModel());
      System.out.println(c2.getCompany());
      System.out.println(c2.getYear());
    }
}


class Car {

    private String company;
    private String model;
    private int year;

    Car(String company, String model, int year) {
        this.setCompany(company); 
        this.setModel(model);
        this.setYear(year);
    }

    // this constructor for copy from one object to another while creating
    Car(Car x) {
      this.copy(x);
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

    //copy mothod 
    public void copy(Car x) {
      this.setCompany(x.getCompany());
      this.setModel(x.getModel());
      this.setYear(x.getYear());
    }
    // the above method will take the object as parameter and call the current obejct (aka object that calling this method) setMethods to set by use the getMethods from the passed object 
    // easy just look the above code to understand
}
