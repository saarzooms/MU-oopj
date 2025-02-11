// fibonacci series

import java.util.Scanner;

class PracticalTwo {
    public void printFibo(int n) {

        int f = 0;
        int s = 1;
        System.out.print(f + " " + s);
        int c = s;
        // logic to print upto n
        while (c < n) {
            c = f + s;
            f = s;
            s = c;
            System.out.print(" " + c);
        }
        f = 0;
        s = 1;
        System.out.println("\n===========================");
        System.out.print(f + " " + s);
        c = s;
        // logic to print n elements of series
        for (int i = 3; i <= n; i++) {

            c = f + s;
            f = s;
            s = c;
            System.out.print(" " + c);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to generate series:");
        int n = sc.nextInt();
        new PracticalTwo().printFibo(n);
        sc.close();
    }
}