import java.util.*;

public class Mathq {
    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primefactor(int n) {
        for (int i = 1; i <= 21 / 2; i++) {
            if (n % i == 0) {
                if (isprime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void divisors(int n) {
        // even
        /*
         * if (n % 2 == 0) {
         * int j=1;
         * for (int i = 2; i <= n; i += 2) {
         * if (n % i == 0) {
         * ans[j++]=i;
         * }
         * }
         * }
         * //odd
         * if (n % 2 != 0) {
         * int j=1;
         * for (int i = 3; i <= n; i += 2) {
         * if (n % i == 0) {
         * ans[j++]=i;
         * }
         * }
         * }
         * Time Complexity ---o(n)
         */

        // another approach -- TC- o(n/2)--n/2 iteration
        /*
         * for (int i = 1; i <= n / 2; i++) {
         * if (n % i == 0) {
         * System.out.print(i + " ");
         * }
         * }
         * System.out.print(n + " ");
         */

        // another approach -- TC- o(n/2)--n/2 se kam iteration
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }

    }

    public static int sumdigit(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int res = sumdigit(num);
        // divisors(num);
        primefactor(num);
        sc.close();
    }
}