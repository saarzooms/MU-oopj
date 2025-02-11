class PracticalSeven {
    public static void main(String[] args) {
        EnggStudent estu = new EnggStudent();
        Faculty f = new Faculty();
        Person pstu = new EnggStudent();
        Person pf = new Faculty();

    }
}

interface Person {
    void getName();
}

interface Student extends Person {
    void calcResult();
}

interface Staff {
    void calcSalary();
}

class EnggStudent implements Student, Person {

    @Override
    public void getName() {

    }

    @Override
    public void calcResult() {

    }

}

class Faculty implements Staff, Person {
    @Override
    public void getName() {

    }

    @Override
    public void calcSalary() {

    }
}