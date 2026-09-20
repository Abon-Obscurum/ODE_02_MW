package division;


public class NegativeDividendException extends Exception {

    /**
     * @param message what went wrong
     */
    public NegativeDividendException(String message) {
        super(message);
    }
}