import Classes.Book;
import Classes.Library;
import Classes.User.Student;
import Classes.User.Teacher;
import Enums.StateBorrow;
import Exceptions.*;

import java.util.Scanner;

public class Main {

    public static void showOptions() {
        System.out.println("Select an option:");
        System.out.println("1. Borrow a book.");
        System.out.println("2. Return a book.");
        System.out.println("3. List books.");
        System.out.println("4. List active lent books.");
        System.out.println("0. Exit");
        System.out.println("Select an option:");

    }


    public static void main(String[] args) {

        System.out.println("Welcome to the Sailor Moon Library Management System~");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int id;
        int isbn;
        int days;
        String borrowid;
        //Create a library with burnt in data hehe
        Library StarterLibrary = new Library(10, 10,20);
        Student s1 = new Student("Alejo", "alejo@eia.co", 3);  //ID = 1
        Student s2 = new Student("Majito", "majito@eia.co", 3); //ID = 2
        Teacher t1 = new Teacher("SebZ", "sebz@eia.co", "compsci🇰🇵"); //ID = 3
        Book b1 = new Book(1231, "WonderlandCastle", "MR Hopkins", 1);
        Book b2 = new Book(2343, "WonderlandCastle2", "MR Hopkins", 32);
        Book b3 = new Book(1231, "WonderlandCastle3", "MR Hopkins", 11);

        StarterLibrary.addUser(s1);
        StarterLibrary.addUser(s2);
        StarterLibrary.addUser(t1);
        StarterLibrary.addBook(b1);
        StarterLibrary.addBook(b2);
        StarterLibrary.addBook(b3);

        while (true) {

            System.out.println("Current library:");
            showOptions();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter User ID:");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Book ISBN:");
                    isbn = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter days to borrow:");
                    days = Integer.parseInt(sc.nextLine());

                    try {
                        System.out.println("This is your BorrowID: " + StarterLibrary.borrowBook(id, isbn, days));
                        System.out.println("Book Borrowed successfully!");
                    } catch (UserDoesntExistException e) {
                        System.out.println(e.getMessage());
                    } catch (BookDoesntExistException e) {
                        System.out.println(e.getMessage());
                    } catch (CopyDoesntExistException e) {
                        System.out.println(e.getMessage());
                    } catch (DaysBorrowedInvalidException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter your Borrowed ID");
                    System.out.print("PR-");
                    borrowid = "PR-"+ sc.nextLine();
                    try {
                        StarterLibrary.returnBook(borrowid);
                        System.out.println("Book Returned successfully!");
                    } catch (BorrowedDoesntExistException e) {
                        System.out.println(e.getMessage());
                    } catch (BookAlreadyReturnedException e) {
                        System.out.println(e.getMessage());
                    }


                    break;
                case 3:
                    StarterLibrary.listBooks();
                    break;
                case 4:
                    StarterLibrary.listBooksBorrowed();
                    break;
            }

        }
    }
}
