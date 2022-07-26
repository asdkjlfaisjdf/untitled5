package Lesson1;

import java.util.Comparator;

public class Book implements Comparator<Book> {
    int id;
    String name;
    String category;

    public Book() {
    }

    public Book(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public int compare(Book o1, Book o2) {
        if (id == id) {
            return 0;

        } else {
            if (id == id) {
                return 1;
            } else {

                return -1;
            }
        }
    }
}





