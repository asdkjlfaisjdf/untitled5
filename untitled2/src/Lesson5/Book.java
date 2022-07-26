package Lesson5;

public class Book implements Comparable<Book>{

    int id;
    String name;
    int age;

    public Book() {
    }

    public Book(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Book o) {
        if (id==o.id){
            return 1;
        }else {
            if (id<o.id){
                return 0;
            }else {
                return -1;
            }
        }
    }
}
