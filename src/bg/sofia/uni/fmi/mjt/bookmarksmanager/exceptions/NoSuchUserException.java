package bg.sofia.uni.fmi.mjt.bookmarksmanager.exceptions;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(String message) {
        super(message);
    }
}
