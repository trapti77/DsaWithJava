import java.util.HashSet;
import java.util.*;

class Subs {
    public static void fun(String str, int i, int n, String st, HashSet<String> set) {
        if (i == n) {
            if (set.contains(st)) {
                return;
            } else {
                System.out.print(st + " ");
                set.add(st);
                return;
            }
        }
        char ch = str.charAt(i);
        fun(str, i + 1, n, st + ch, set);
        fun(str, i + 1, n, st, set);
    }
}

public class UniSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String str = sc.nextLine();
        Subs.fun(str, 0, str.length(), "", set);
    }
}
