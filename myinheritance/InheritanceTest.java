import java.util.Scanner;

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter staff/student");
        String choice = sc.nextLine();
        Person p;
        if (choice.equals("staff"))
            p = new Staff();
        else
            p = new Student();
        p.name = sc.nextLine();
        p.address = sc.nextLine();
        p.gender = sc.nextLine();
        p.contactNumber = sc.nextLine();
        p.display();
    }
}

class Person {
    protected String name;
    String address;
    String gender;
    String contactNumber;

    void display() {
        System.out.println(this.name + " " + this.address + " " + this.gender + " " + this.contactNumber);
    }
}

class Student extends Person {
    String enroll;
    String dept;
    String div;
    int sem;

    @Override
    void display() {
        super.display();
        System.out.println(this.name);
        System.out.println(this.enroll + " " + this.dept
                + " " + this.div + " " + this.sem);
    }
}

class Staff extends Person {
    String empCode;
    String org;
    int salary;

    @Override
    void display() {
        super.display();

        System.out.println(this.empCode + " " + this.org
                + " " + this.salary);
    }
}
