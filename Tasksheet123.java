
public class Tasksheet123 {
    public static void main(String[] args) {
        Book book1 = new Book("Bleach", "Tite Kubo", 2001, 9.99);
        Book book2 = new Book("Hunter x Hunter", "Yoshihiro Togashi", 1998, 12.99);
        Book book3 = new Book("One Piece", "Eiichiro Oda", 1997, 11.99);

        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2 + "\n");
        System.out.println("Book 3:\n" + book3);
    }
}
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}


