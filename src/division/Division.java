package division;

public class Division {

    /**
     * Divides two integers.
     * @param dividend number to divide
     * @param divisor number to divide by
     * @return result of the division
     * @throws DivisionByZeroException if the divisor is 0
     * @throws NegativeDividendException if dividend or divisor is negative
     * @throws DivisionException on any other error
     */
    public static int performDivision(int dividend, int divisor)
            throws DivisionByZeroException, NegativeDividendException, DivisionException {

        /* checked before dividing, otherwise the ArithmeticException hits first */
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisor ist 0");
        }

        if (dividend < 0 || divisor < 0) {
            throw new NegativeDividendException("Dividend oder Divisor ist negativ");
        }

        try {
            return dividend / divisor;
        } catch (Exception e) {
            /* safety net, the two checks above already cover the known cases */
            throw new DivisionException("Fehler bei der Division", e);
        }
    }
}