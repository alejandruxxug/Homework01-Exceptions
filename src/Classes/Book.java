package Classes;

public class Book {
    private long isbn;
    private String  title;
    private String author;
    private int copies;
    private int copiesAvailable;

    //Constructor

    public Book(long isbn, String title, String author, int copies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.copiesAvailable = copies;
    }
}
