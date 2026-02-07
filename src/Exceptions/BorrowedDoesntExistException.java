package Exceptions;

public class BorrowedDoesntExistException extends RuntimeException {
    public BorrowedDoesntExistException(String message) {
        super(message);
    }
}
