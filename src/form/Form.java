package fhtw.form;

/**
 * Interface for geometric shapes.
 */

public interface Form {

    /**
     * Calculates area of shape.
     * @return area in mm²
     */
    public abstract double flaeche();

    /**
     * Calculates perimeter of shape.
     * @return perimerter in mm
     */
    public abstract double umfang();

    /**
     * Prints area, perimeter and the dimensions of the shape.
     */
    public abstract void info();
}
