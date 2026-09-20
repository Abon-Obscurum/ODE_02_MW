package division;


public class DivisionException extends Exception {

    /**
     * @param message what went wrong
     * @param cause the original exception
     */
    public DivisionException(String message, Throwable cause) {
        super(message, cause);
    }
}