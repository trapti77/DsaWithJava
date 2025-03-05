
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//check duplicates
public class Dupli {
    // TC-O(n^2)
    public boolean method1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // TC--O(nlogn)
    public boolean method2(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // TC-O(n) SC-O(n)
    public boolean method3(int[] arr) {
        Set st = new HashSet<>();
        for (int e : arr) {
            if (st.contains(e)) {
                return true;
            }
            st.add(e);
        }
        return false;
    }

    // TC-O(n)
    public boolean method4(int[] arr) {
        return Arrays.stream(arr).distinct().count() < arr.length;
    }

    public static void main(String[] args) {
        Dupli dp = new Dupli();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(dp.method1(arr));
        System.out.print(dp.method2(arr));
        System.out.print(dp.method3(arr));
        System.out.print(dp.method4(arr));
    }
}
