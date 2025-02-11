public class TestCls {

    static int result;

    static int fun(int a, int b) {
        System.out.println(a + " " + b);
        return TestCls.result;
    }

    public static void main(String arr[]) {
        TestCls obj1 = new TestCls();
        TestCls obj2 = new TestCls();
        fun(obj1.result = 10, obj2.result = 50);
        System.out.println(result);
    }
}