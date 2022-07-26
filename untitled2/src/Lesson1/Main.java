package Lesson1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book(2,"java","dasturlash"));
        bookArrayList.add(new Book(1,"C++","dasturlash"));
        bookArrayList.add(new Book(3,"C","dasturlash"));

        bookArrayList.sort(new Book1());

        Comparator<Book> bookComparator = Comparator.comparing(Book::getId);

        bookArrayList.sort(bookComparator);
        for (Book book : bookArrayList) {
            System.out.println(book.id+""+book.name+" "+book.category);

        }
    }
}
