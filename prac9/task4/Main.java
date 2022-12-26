package prac.prac9.task4;

public class Main {
    public static void main(String[] args) {
        MyComparable c = new MyComparable();
        int a3[] = {1, 2, 3, 5, 5, 12, 3, 6, 3};
        int b3[] = {2, 6, 2, 6, 57, 12, 3, 6, 3};
        int d[] = {2, 6, 2, 6, 57, 12, 3, 6, 3};
        System.out.println(c.comparable(b3,d));
        boolean a = true, b = false;
        System.out.println(c.comparable(a, b));
        int a1 = 1, b1 = 1;
        System.out.println(c.comparable(a1, b1));
        char a2 = 'a', b2 = 'c';
        System.out.println(c.comparable(a2, b2));
    }
}
