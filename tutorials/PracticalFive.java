public class PracticalFive {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secObj = new Person("Arzoo", "Alam");
        firstObj.dislay();
        firstObj.dislay(true);
        firstObj.dislay(false);
        secObj.dislay();
        secObj.dislay(true);
        secObj.dislay(false);
    }
}

class Person {
    private String fname;
    private String lname;
    private String fullName;

    // default constructor
    Person() {
        fname = "";
    }

    // parameterized constructor (constructor overloading)
    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        fullName = this.fname + " " + this.lname;
    }

    // to display fname and lname only
    void dislay() {
        System.out.println(this.fname + " " + this.lname);
    }

    // based on b display along with fullName
    void dislay(boolean b) {
        if (b)
            System.out.println(this.fname + " " + this.lname + " " + this.fullName);
        else
            System.out.println(this.fname + " " + this.lname);
        System.out.println(this.fname + " " + this.lname + (b ? " " + fullName : ""));

    }
}