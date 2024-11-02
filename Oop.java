import java.util.*;

final class Student {
    // final int num = 99;
    final int num;

    Student() {
        // num = n;
        // num = 5;
        System.out.println("constructor called");
    }

    {
        num = 10;
    }

    final public void fun() {
        System.out.print("number is  " + num);
    }
}

class Trapti extends Student {// cannot inherit final class
    public void func() {
        System.out.println("trapti class execute");
    }
}

public class Oop {

    public static void main(String[] args) {
        Trapti tr = new Trapti();
        tr.func();
    }

}
