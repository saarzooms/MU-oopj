class StaticTest {
    static int orgCode = 10;

    int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        StaticTest obj = new StaticTest();
        StaticTest obj2 = new StaticTest();
        obj.add(4, 5);
        StaticTest.sub(40, 5);
        sub(45, 75);
        // add(4,5);
        System.out.println(orgCode);
        System.out.println(obj.orgCode);
        System.out.println(obj2.orgCode);
        obj.orgCode = 30;
        System.out.println(orgCode);
        System.out.println(obj.orgCode);
        System.out.println(obj2.orgCode);
        obj2.orgCode = 60;
        System.out.println(orgCode);
        System.out.println(obj.orgCode);
        System.out.println(obj2.orgCode);
        System.out.println("from main method");
    }
}