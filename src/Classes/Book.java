package Classes;

import Exceptions.BookDoesntExistException;
import Exceptions.CopyDoesntExistException;
import Exceptions.UserDoesntExistException;

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

    public void addCopy() {
        this.copiesAvailable++;
    }

    // cant take a copy if there are none to take hehe
    public void takeCopy() throws CopyDoesntExistException {
        if (this.copiesAvailable > 0) {
        this.copiesAvailable--;
        } else {
            throw new CopyDoesntExistException("No copies available");
        }
    }

    //Getters n Setters

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }
}
