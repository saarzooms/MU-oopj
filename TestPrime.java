import java.util.Scanner;

public class TestPrime {
    boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n + "is " + (new TestPrime().isPrime(n) ? " prime" : "not prime"));
    }
}
