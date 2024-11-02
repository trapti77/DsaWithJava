public class Prime {
    public static void main(String[] args) {
        int div = 2;
        int n = 8;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("Not prime");
                break;
            } else {
                div++;
            }
        }
        System.out.println("Prime Number");
    }
}
