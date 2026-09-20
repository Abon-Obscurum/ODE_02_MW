package form;

import java.util.Locale;

/**
 * Abstract base class for geometric shapes.
 */
public abstract class Form {

    /**
     * Calculates area of shape.
     * @return area in mm²
     */
    public abstract double flaeche();

    /**
     * Calculates perimeter of shape.
     * @return perimeter in mm
     */
    public abstract double umfang();

    /**
     * Builds the info string of the shape.
     * Format: (Klassenname): (interne Var), (Fläche), (Fläche int in HEX), (Umfang)
     * @return info string of the shape
     */
    public abstract String info();

    /**
     * Area truncated to int, converted to hexadecimal.
     * Integer.toHexString() only takes an int, hence the cast.
     * @return area as hex string
     */
    protected String flaecheAlsHex() {
        return Integer.toHexString((int) flaeche());
    }

    /**
     * Formats a double with 2 decimal places
     * @param wert value to format
     * @return formatted value
     */
    protected double gerundet(double wert) {
        return Math.round(wert * 100) / 100.00;
    }
}