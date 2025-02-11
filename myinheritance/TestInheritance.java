public class TestInheritance {
    public static void main(String[] args) {
        C a = new C();
        a.methodOne();
    }
}

class A {
    void methodOne() {
        System.out.println("from method one of class A");
        methodTwo();
    }

    void methodTwo() {
        System.out.println("from method Two of class A");
    }
}

class B extends A {
    @Override
    void methodOne() {
        System.out.println("from method one of class B");
        super.methodOne();
    }

    @Override
    void methodTwo() {
        System.out.println("from method Two of class B");
    }
}

class C extends B {
    @Override
    void methodOne() {
        System.out.println("from method one of class C");
        super.methodOne();
    }

    @Override
    void methodTwo() {
        System.out.println("from method Two of class C");
    }
}
