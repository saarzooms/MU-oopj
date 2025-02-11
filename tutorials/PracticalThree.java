import java.util.Scanner;

class PracticalThree {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee code");
        emp.setEmpCode(sc.nextLine());
        System.out.println("Enter employee name");
        emp.setName(sc.nextLine());
        System.out.println("Enter org name");
        emp.setOrgName(sc.nextLine());
        System.out.println("Enter emp salary");
        emp.setSalary(sc.nextInt());
        sc.nextLine();
        Address temp = new Address();
        System.out.println("Enter curr line first");
        temp.setLineFirst(sc.nextLine());
        System.out.println("Enter curr line second");
        temp.setLineSecond(sc.nextLine());
        System.out.println("Enter curr city");
        temp.setCity(sc.nextLine());
        System.out.println("Enter curr state");
        temp.setState(sc.nextLine());
        System.out.println("Enter curr country");
        temp.setCountry(sc.nextLine());
        emp.setCurrAddr(temp);
        Address ptemp = new Address();
        System.out.println("Enter per line first");
        ptemp.setLineFirst(sc.nextLine());
        System.out.println("Enter per line second");
        ptemp.setLineSecond(sc.nextLine());
        System.out.println("Enter per city");
        ptemp.setCity(sc.nextLine());
        System.out.println("Enter per state");
        ptemp.setState(sc.nextLine());
        System.out.println("Enter per country");
        ptemp.setCountry(sc.nextLine());
        emp.setPerAddr(ptemp);
        System.out.println(emp.displayEmployeeDetails());
        emp.getCurrAddr().setCity("Unknown");
        System.out.println(emp.displayEmployeeDetails());
        System.out.println(temp.displayAddress());

    }
}

class Employee {
    private String name;
    private String empCode;
    private String orgName;
    private int salary;
    private Address currAddr;
    private Address perAddr;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return this.empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getCurrAddr() {
        return this.currAddr;
    }

    public void setCurrAddr(Address currAddr) {
        this.currAddr = currAddr;
    }

    public Address getPerAddr() {
        return this.perAddr;
    }

    public void setPerAddr(Address perAddr) {
        this.perAddr = perAddr;
    }

    public String displayEmployeeDetails() {
        return "\n Employee Details\n " + this.empCode + "\n" + this.name + "\n " + this.orgName + "\n " + this.salary
                + "\n" + this.currAddr.displayAddress()
                + "\n" + this.perAddr.displayAddress();
    }
}

class Address {
    private String lineFirst;
    private String lineSecond;
    private String city;
    private String state;
    private String country;

    public String getLineFirst() {
        return this.lineFirst;
    }

    public void setLineFirst(String lineFirst) {
        this.lineFirst = lineFirst;
    }

    public String getLineSecond() {
        return this.lineSecond;
    }

    public void setLineSecond(String lineSecond) {
        this.lineSecond = lineSecond;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String displayAddress() {
        return this.lineFirst + "\n" + this.lineSecond + "\n" + this.city + " " + this.state + " " + this.country;
    }
}