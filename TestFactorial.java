import java.util.Scanner;

public class TestFactorial {
    int fact(int n) {
        // logic to find factorial
        if (n < 2)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(new TestFactorial().fact(n));
    }

}
