import Classes.Library;
import Enums.StateBorrow;

public class Main {

    public static void showOptions() {
        System.out.println("Select an option:");
        System.out.println("1. Borrow a book.");
        System.out.println("2. Return a book.");
        System.out.println("3. List books.");
        System.out.println("4. List active lent books.");
        System.out.println("0. Exit");

    }


    public static void main(String[] args) {

        System.out.println("Welcome to the Sailor Moon Library Management System~");
        int choice = 0;
        //Create a library with burnt in data hehe
        Library StarterLibrary = new Library(10, 10,20);

        while (true) {

            System.out.println("Current library:");
            showOptions();


        }
    }
}
