public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруэлл", 299.9f);
        Book book2 = new Book("Война и мир","Лев Толстой", 499.5f);
        Book book3 = new Book("Мастер и Маргарита","Михаил Булгаков", 350);
    
    }
}

class Book {

    String name;
    String author;
    float price;

    public Book(String name, String author, float price) {
        this.name = name;
        this.author = author;
        this.price = price;

        displayInfo(name, author, price);
    }

    void displayInfo(String a, String b, float c) {
        System.out.printf("Name: %s \t Author: %s \t Price: %.2f\n", a, b, c);
    }
}
