package Lesson1;

import java.util.Scanner;

import static java.lang.System.in;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("sonni kiriting");
        System.out.println(" = ");
        int num = scanner.nextInt();

        int res = 0;
        for (int i = 0; i < 10; i++) {

            res = num * 1;
            System.out.println(num + "*" + i + "=" + res);

        }

    }
}
