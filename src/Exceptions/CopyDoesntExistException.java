package Exceptions;

public class CopyDoesntExistException extends RuntimeException {
    public CopyDoesntExistException(String message) {
        super(message);
    }
}
