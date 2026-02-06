package Classes;

import Classes.User.User;
import Enums.StateBorrow;

public class Borrow {
    private static int counter = 0;
    private int id;
    private User borrower;
    private int daysBorrowed;
    private StateBorrow stateBorrow;

    //Constructor
    public Borrow(User borrower, int daysBorrowed, StateBorrow stateBorrow) {
        counter++;
        id = counter;
        this.borrower = borrower;
        this.daysBorrowed = daysBorrowed;
        this.stateBorrow = stateBorrow;
    }


}
