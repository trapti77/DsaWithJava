import java.util.*;

class Employee {
    public int salary = 10000;
}

class Emp extends Employee {
    int salary = 20000;

    public void func() {
        int salary = 30000;
        System.out.println(salary);
        System.out.println(this.salary);
        System.out.println(super.salary);
    }
}

public class Oop1 {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.func();
    }
}
