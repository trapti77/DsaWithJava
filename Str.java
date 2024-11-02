import java.util.*;

public class Str {
    public static void main(String[] args) {
        String s1 = new String("computers");
        String s4 = new String("Computers");
        System.out.println(s1);
        String s2 = s1.toUpperCase();// these function return the string
        System.out.println(s2);
        String s3 = s2.toLowerCase();
        System.out.println(s3);
        int idx1 = s1.indexOf('T');
        int idx = s1.indexOf('T', 6);// search from 6 index
        System.out.println(idx);
        int idx2 = s1.indexOf("uTe");
        int idx3 = s1.indexOf("uTe", 5);
        System.out.println(idx3);
        int lidx1 = s1.lastIndexOf('T');
        int lidx = s1.lastIndexOf('T', 6);// search from 6 index
        System.out.println(lidx1);
        int lidx2 = s1.lastIndexOf("uTe");
        int lidx3 = s1.lastIndexOf("uTe", 5);
        System.out.println(lidx2);
        if (s1.equals(s4)) {// check casesensitive
            System.out.println("strings are same");
        } else {
            System.out.println("strings are not same");
        }
        if (s1.equalsIgnoreCase(s4)) {// check either caseinsensitive
            System.out.println("strings are same");
        } else {
            System.out.println("strings are not same");
        }
        if (s1.compareTo(s4) == 1) {// compare two string with unicode it return 0 and 1
            System.out.println("strings are same");
        } else {
            System.out.println("strings are not same");
        }
    }
}
