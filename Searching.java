import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    // linear search TC- O(n)
    public static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary search TC- O(logn)
    public static int binarysearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        Arrays.sort(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = 3;
        System.out.println(linearsearch(arr, key));
        System.out.println(binarysearch(arr, key));
    }
}
