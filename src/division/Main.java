package division;

public class Main {

    public static void main(String[] args) {
        /* one call per case: ok, divisor 0, negative dividend, negative divisor */
        teste(10, 2);
        teste(10, 0);
        teste(-10, 2);
        teste(10, -2);
    }

    /**
     * Runs one division and prints the result or the error.
     * @param dividend number to divide
     * @param divisor number to divide by
     */
    private static void teste(int dividend, int divisor) {
        try {
            int ergebnis = Division.performDivision(dividend, divisor);
            System.out.println(dividend + " / " + divisor + " = " + ergebnis);

            /* specific exceptions first, the general one last */
        } catch (DivisionByZeroException e) {
            System.out.println("Division durch 0: " + e.getMessage());
        } catch (NegativeDividendException e) {
            System.out.println("Negativer Wert: " + e.getMessage());
        } catch (DivisionException e) {
            System.out.println("Division fehlgeschlagen: " + e.getMessage());
        }
    }
}