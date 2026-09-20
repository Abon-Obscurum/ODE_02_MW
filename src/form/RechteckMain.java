package form;

import java.util.Scanner;

public class RechteckMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Original assigned these two the other way round */
        double laenge = leseZahl(scan, "Geben Sie die Laenge an: ");
        double breite = leseZahl(scan, "Geben Sie die Breite an: ");

        /* close() also closes System.in for good, so it goes last */
        scan.close();

        /* Rechteck is part of the hierarchy, so it does the math */
        Rechteck rechteck = new Rechteck(laenge, breite);

        System.out.println("Umfang: " + rechteck.umfang());
        System.out.println("Flaeche: " + rechteck.flaeche());
        System.out.println("Info: " + rechteck.info());
    }

    /**
     * Reads a number until the input is valid.
     * @param scan scanner on System.in
     * @param text prompt for the user
     * @return value greater than 0
     */
    private static double leseZahl(Scanner scan, String text) {
        while (true) {
            System.out.print(text);

            /* next() would throw if there is no input left */
            if (!scan.hasNext()) {
                System.out.println("\nNo input left, fallback value is 2");
                return 2;
            }

            String eingabe = scan.next();

            try {
                /* parseDouble throws on "abc" or "2,5", only the dot works */
                double wert = Double.parseDouble(eingabe);

                /* 0 or negative is a valid number but not a valid side */
                if (wert <= 0) {
                    System.out.println("Value must be bigger then 0");
                    continue;
                }
                return wert;

            } catch (NumberFormatException e) {
                System.out.println("\"" + eingabe + "\" is not a number, use 2.5 with a dot");
            }
        }
    }
}