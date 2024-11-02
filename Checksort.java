import java.util.*;

class Issort {
    public void fun(int a[], int n, int i) {
        if (i == n) {
            System.out.print("true");
            return;
        }
        if (a[i] < a[i - 1]) {
            System.out.print("false");
            return;
        }
        fun(a, n, i + 1);
    }
}

public class Checksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Issort srt = new Issort();
        srt.fun(arr, n, 1);
        sc.close();
        // System.out.print(srt.fun(arr,n,1));
    }
}
