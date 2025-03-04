import java.util.*;

public class Mathq1 {
    public static int powe(int n, int len) {
        int ans = 1;
        while (len > 0) {
            ans *= n;
            len--;
        }
        return ans;
    }

    public static void armstrong(int n) {
        int len = 0;
        int num = n;
        int num1 = n;
        while (n > 0) {
            len++;
            n /= 10;
        }
        int armnum = 0;
        while (num > 0) {
            int d = num % 10;
            armnum += powe(d, len);
            num /= 10;
        }

        if (num1 == armnum) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean SumOfTwoPrimeNumOrNot(int n) {
        for (int i = 1; i <= n - 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i + " " + (n - i));
                return true;
            }
        }
        return false;
    }

    public static void printAPseries(int n, int diff, int pos) {
        for (int i = 1; i <= pos; i++) {
            n += diff;
            System.out.print(n + " ");
        }
    }

    public static void printGPseries(int n, int ratio, int pos) {
        for (int i = 1; i <= pos; i++) {
            int temp = n * (int) Math.pow(ratio, i - 1);
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // check armstrong number
        // armstrong(num);
        /*
         * if (SumOfTwoPrimeNumOrNot(num)) {
         * System.out.println("yes this num is a sum of two prime number");
         * } else {
         * System.out.println("yes this num is not a sum of two prime number");
         * }
         */
        // printAPseries(num, 2, 10);
        printGPseries(num, 2, 4);
        sc.close();
    }
}
