public class TestStudent {
    public static void main(String[] args) {
        Student studentOne = new Student();
        Student studentTwo = new Student("123", "Aagaz", 47, "A");
        System.out.println(studentOne.display());
        System.out.println(studentTwo.display());
        studentOne.setName("Arzoo");
        System.out.println("after setName called on studentOne object");
        System.out.println(studentOne.display());
        System.out.println(studentTwo.display());
        // print studentOne's name
        System.out.println(studentOne.getName());
        // print studentTwo's name
        System.out.println(studentTwo.getName());
    }

}
