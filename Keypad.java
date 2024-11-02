import java.util.*;

public class Keypad {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void fun(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.print(combination + " ");
            return;
        }
        char ch = str.charAt(idx);
        String mapping = keypad[ch - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            fun(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        Keypad.fun(str, 0, "");
    }
}
