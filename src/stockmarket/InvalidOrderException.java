package stockmarket;


// Custom exception for order handling
public class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}