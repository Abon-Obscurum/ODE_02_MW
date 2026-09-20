package division;


public class DivisionByZeroException extends Exception {

    /**
     * @param message what went wrong
     */
    public DivisionByZeroException(String message) {
        super(message);
    }
}