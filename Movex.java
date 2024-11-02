import java.util.*;

class MoveX {
    public String fun(String str, int c, String ans) {
        if (c == 0) {
            return ans;
        }
        ans += 'x';
        return fun(str, c - 1, ans);
    }
}

public class Movex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        MoveX obj = new MoveX();
        System.out.println("before move x :" + str);
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                c++;
            } else {
                ans += str.charAt(i);
            }
        }
        String result = obj.fun(str, c, ans);
        System.out.println("after move x :" + result);
        sc.close();
    }
}
