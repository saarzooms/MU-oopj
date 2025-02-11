public class Student {
    private String enroll;
    private String name;
    private int roll;
    private String div;

    public Student() {
        this.enroll = "un";
    }

    public Student(String enroll, String name, int roll, String div) {
        this.enroll = enroll;
        this.name = name;
        this.roll = roll;
        this.div = div;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public String getEnroll() {
        return this.enroll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getDiv() {
        return this.div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String display() {
        return this.enroll + " " + this.name + " " + this.roll + " " + this.div;
    }

}