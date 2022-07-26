package Lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static Scanner scanner = new Scanner(in);
    public static int id;
    public static int age;
    public static String name;
    public static String name1;
    public static int n;
    public static int a;
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();

        while (true){
            System.out.println("[1] Malumot qushish");
            System.out.println("[2] Malumot kurish");
            System.out.println("[3] Malumot o'chirish");
            System.out.println("[4] Malumotni bittalab o'chirish");
            System.out.println(" = ");
            n = scanner.nextInt();

                if (n==1){
                    System.out.println("id ni kiriting");
                    id = scanner.nextInt();
                    System.out.println("ismni kiriting");
                    name = scanner.next();
                    System.out.println("yoshni kiriting");
                    age = scanner.nextInt();

                    bookArrayList.add(new Book(id,name,age));

                }else if (n == 2) {
                    Collections.sort(bookArrayList);
                    bookArrayList.forEach(book -> {
                        System.out.println("ism: " + book.name + ", idsi: " + book.id + ", yoshi: " + book.age);
                    });
                    System.out.println();
                } else if (n == 3) {
                    bookArrayList.clear();

                }else if (n==4){
                    System.out.println("ism bo'yicha o'chirish");
                    System.out.println("id bo'yicha o'chirish");
                    System.out.println("yosh bo'yicha o'chirish");
                    n = scanner.nextInt();
                }else if (a == 1){
                    System.out.println("ismni kiriting");
                    name1 = scanner.next();
                    bookArrayList.removeIf(book -> book.getName().equals(name1));
                } else if (a == 2) {
                    System.out.println("idni kiriting");
                    int b = scanner.nextInt();
                    bookArrayList.removeIf(book -> book.getId()==b);
                } else if (a == 3) {
                    System.out.println("yoshni kiriting");
                    int c = scanner.nextInt();
                    bookArrayList.removeIf(book -> book.getAge()==c);
                }
        }

    }
}
