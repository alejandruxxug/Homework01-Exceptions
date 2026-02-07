package Classes;

import Classes.User.Student;
import Classes.User.Teacher;
import Classes.User.User;
import Enums.StateBorrow;
import Exceptions.*;

public class Library {
    private Book[] books;
    private int numberOfBooks;
    private User[] users;
    private int numberOfUsers;
    private Borrow[] borrowTransactions;
    private int numberOfBooksBorrowed;


    //Constructor
    public Library(int numberOfBooks, int numberOfUsers, int numberOfBooksBorrowed) {
        this.numberOfBooks = numberOfBooks;
        this.numberOfUsers = numberOfUsers;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        books = new Book[numberOfBooks];
        users = new User[numberOfUsers];
        borrowTransactions = new Borrow[numberOfBooksBorrowed];
    }

    //addBook into static array -- TWT no arraylist TWT waaa TWT --
    public void addBook(Book book) throws FullCapacityException {

        if (!(books.length < numberOfBooks)) {
            throw new FullCapacityException("The library is full of books😭");
        } else  {
            for (int i = 0; i < books.length; i++) {
                if (books[i].equals(null)) {
                   books[i] = book;
                   break;
                 }
            }
        }
    }

    //Register user -- same problem as before no arraylist TWT
    public void addUser(User user) throws FullCapacityException {
        if (!(users.length < numberOfUsers)) {
            throw new FullCapacityException("The library cant have more Staff 😭😭");
        } else {
            for (int i = 0; i < users.length; i++) {
                if (users[i].equals(null)) {
                    users[i] = user;
                    break;
                }
            }
        }
    }

    // find a borrow transact omggggggg
    public Borrow lookForBorrow(String id) throws BorrowedDoesntExistException {
        for (int i = 0; i < borrowTransactions.length ; i++){
            if (borrowTransactions[i].getId().equals(id)) {
                return borrowTransactions[i];
            }
        }
        throw new BorrowedDoesntExistException("The borrow transaction could not be found 🥲");
    }

    // find a book omg
    public Book lookForBook(int isbn) throws BookDoesntExistException {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        throw new BookDoesntExistException("The book with ISBN " + isbn + " does not exist");
    }


    // find a user omggg
    public User lookForUser(int userid) throws UserDoesntExistException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userid) {
                return users[i];
            }
        }
        throw new UserDoesntExistException("User doesn't exist");
    }

    //Borrow Book! // check if we can borrow more books // then check the teacher or student or if its less than 0
    public String borrowBook(int userId, int isbn, int days) throws FullCapacityException, BookDoesntExistException, UserDoesntExistException, DaysBorrowedInvalidException {

        Book book = lookForBook(isbn);
        User user = lookForUser(userId);

        if (!(borrowTransactions.length == numberOfBooksBorrowed)) {
            throw new FullCapacityException("The library cant lend more books 📕");
        }

        if (days <= 0) {
            throw new DaysBorrowedInvalidException("The days must be greater than 0! 😘");
        } else if (user.getClass().equals(Student.class) && days > 7) {
            throw new UserDoesntExistException("Girlll you be thinking that as a student you can borrow for more than 7 days 🤣");
        } else if (user.getClass().equals(Teacher.class)) {
            throw new UserDoesntExistException("Girlll you be thinking that as a teacher you can borrow for more than 14 days 🤣");

        }

        Borrow b = new Borrow(user, book, days, StateBorrow.ACTIVE);

        for (int i = 0; i < borrowTransactions.length; i++) {
            if (borrowTransactions.equals(null)) {
                borrowTransactions[i] = b;
                break;
            }
        }
        return b.getId();
    }

    //Return Book!!
    public void returnBook(String idBorrow) throws BorrowedDoesntExistException, BookAlreadyReturnedException {
        Borrow returnTransaction = lookForBorrow(idBorrow);

        if (returnTransaction.getStateBorrow().equals(StateBorrow.RETURNED)) {
            throw new BookAlreadyReturnedException("This book has already been returned");
        } else {
            returnTransaction.setStateBorrow(StateBorrow.RETURNED);
            returnTransaction.getBook().addCopy(); //Hehe Refresh book
        }
    }


    //Listing
    //Boooooooooooooooksss

    public void listBooks() {
        System.out.println("Available Books and copies: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getCopiesAvailable() > 0) {
                System.out.println(" - " + books[i].getTitle() + ": " + books[i].getCopiesAvailable());
            }
        }
    }

    //Active borroooooweeedBoookssss
    public void listBooksBorrowed() {
        System.out.println("Borrowed books History: ");
        for (int i = 0; i < borrowTransactions.length; i++) {
            if (borrowTransactions[i].getStateBorrow().equals(StateBorrow.ACTIVE)) {
                System.out.println(" - " + borrowTransactions[i].getId() + ": " + borrowTransactions[i].getBook().getCopiesAvailable() + " -> " + borrowTransactions[i].getBorrower().getName());
            }
        }
    }
}


