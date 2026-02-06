package Classes;

import Classes.User.User;

public class Library {
    private Book[] books;
    private int numberOfBooks;
    private User[] users;
    private int numberOfUsers;
    private Borrow[] booksBorrowed;
    private int numberOfBooksBorrowed;


    //Constructor
    public Library(Book[] books, int numberOfBooks, User[] users, int numberOfUsers, Borrow[] booksBorrowed, int numberOfBooksBorrowed) {
        this.numberOfBooks = numberOfBooks;
        this.numberOfUsers = numberOfUsers;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        books = new Book[numberOfBooks];
        users = new User[numberOfUsers];
        booksBorrowed = new Borrow[numberOfBooksBorrowed];
    }

    //addBook

}
