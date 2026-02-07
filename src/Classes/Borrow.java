package Classes;

import Classes.User.User;
import Enums.StateBorrow;
import Exceptions.CopyDoesntExistException;

public class Borrow {
    private static int counter = 0;
    private String id;
    private User borrower;
    private Book book;
    private int daysBorrowed;
    private StateBorrow stateBorrow;

    //Constructor
    public Borrow(User borrower, Book book, int daysBorrowed, StateBorrow stateBorrow) throws CopyDoesntExistException {
        counter++;
        id = "PR-"+counter;
        this.borrower = borrower;
        this.book = book;
        this.daysBorrowed = daysBorrowed;
        this.stateBorrow = stateBorrow;
        book.takeCopy();
    }

    //Getters n setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getDaysBorrowed() {
        return daysBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    public StateBorrow getStateBorrow() {
        return stateBorrow;
    }

    public void setStateBorrow(StateBorrow stateBorrow) {
        this.stateBorrow = stateBorrow;
    }
}
