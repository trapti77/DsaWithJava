import java.util.*;

class Remove {
    public static boolean[] map = new boolean[26];

    public static void fun(String str, int n, int i, String result) {
        if (i == n) {
            System.out.println("after remove duplicate :" + result);
            return;
        }
        char ch = str.charAt(i);
        if (map[ch - 'a'] == true) {
            fun(str, n, i + 1, result);
        } else {
            result += ch;
            map[ch - 'a'] = true;
            fun(str, n, i + 1, result);
        }
    }
}

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("before remove duplicate :" + str);
        Remove.fun(str, str.length(), 0, ""); 
    }
}
