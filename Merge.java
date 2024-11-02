import java.util.Scanner;

public class Merge {
    public void merge(int a[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Merging both parts
        while (i <= mid && j <= ei) {java
            if (a[i] > a[j]) {
                merged[k++] = a[j++];
            } else {
                merged[k++] = a[i++];
            }
        }

        // Remaining elements from the left part
        while (i <= mid) {
            merged[k++] = a[i++];
        }

        // Remaining elements from the right part
        while (j <= ei) {
            merged[k++] = a[j++];
        }

        // Copying merged array back to the original array
        for (int x = 0, y = si; x < merged.length; x++, y++) {
            a[y] = merged[x];
        }
    }

    public void mergesort(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(a, si, mid);
        mergesort(a, mid + 1, ei);
        merge(a, si, mid, ei);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; // Correct array declaration
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Merge obj = new Merge(); // Creating object of Merge class
        obj.mergesort(arr, 0, n - 1);

        // Printing sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
