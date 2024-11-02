import java.util.*;

class Subs {
    public static void fun(String str, int i, int n, String st) {
        if (i == n) {
            System.out.print(st + " ");
            return;
        }
        char ch = str.charAt(i);
        fun(str, i + 1, n, st + ch);
        fun(str, i + 1, n, st);
    }
}

public class Substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Subs.fun(str, 0, str.length(), "");
    }
}
