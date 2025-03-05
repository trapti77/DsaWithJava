import java.util.Scanner;

public class LargestEle {
    // using linear search
    public static int sarchlargele(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return arr[0];
        }
        int maxe = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxe) {
                maxe = arr[i];
            }
        }
        return maxe;
    }

    public static int secondlargele(int[] arr) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sec && arr[i] < first) {
                sec = arr[i];
            }
            if (arr[i] > first) {
                if (first != sec) {
                    sec = first;
                }
                first = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sarchlargele(arr));
        System.out.println(secondlargele(arr));
    }
}
