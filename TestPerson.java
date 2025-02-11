public class TestPerson {
    public static void main(String[] args) {
        Person per = new Person();
        System.out.println(per.firstName);
        System.out.println(per.getFirstName());
        per.firstName = "Arzoo";
        System.out.println(per.firstName);
        System.out.println(per.getFirstName());
        per.setLastName("Alam");
        System.out.println(per.getFullName());
    }
}
