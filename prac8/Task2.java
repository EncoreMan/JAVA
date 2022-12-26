package prac.prac8;

import java.util.Scanner;

public class Task2 {
    public static void solution(int num1) {
        System.out.println(num1);
        if (num1 != 0) {
            solution(--num1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        solution(num1);
    }
}
