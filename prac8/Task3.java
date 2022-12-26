package prac.prac8;

import java.util.Scanner;

public class Task3 {
    public static void solution(int n, int m) {

        System.out.println(n + " " +m);
        if (n > m) {
            solution(--n,m);
        } else if (n < m){
            solution(++n,m);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int num1 = in.nextInt();
          int num2 = in.nextInt();
        solution(num1,num2);
    }
}
