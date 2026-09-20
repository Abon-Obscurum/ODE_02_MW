package fhtw.form;

/**
 * Circle, defined by its radius
 */
public class Kreis implements Form {

    /** Radius in mm, defaults to 2mm*/
    private int radius = 2;

    /**
     * Creates circle with given radiues.
     * Has 0 check for radious so fall back is kept.
     * @param radius radius in mm, must be grater than 0;
     */
    public Kreis(int radius) {
        if(radius > 0){
            this.radius = radius;
        }else{
            System.out.println("Radius must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Creates circle with default radius 2mm
     */
    public Kreis() {
    }

    /**
     * Set radius
     * Has 0 check for radious so fall back is kept.
     * @param radius new radius in mm, mus be greater than 0
     */
    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be bigger than 0, fallback value is 2");
        }
    }

    /**ZZ_q
     * Returns radius
     * @return radius in mm
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Calculates area
     * @return area in mm²
     */
    @Override
    public double flaeche() {
        double flaeche;
        flaeche = Math.PI * (radius * radius);
        return flaeche;
    }

    /**
     * Calculates perimeter
     * @return perimeter in mm
     */
    @Override
    public double umfang() {
        double umfang;
        umfang = Math.PI * (radius * 2);
        return umfang;
    }

    /**
     * Prints area, perimeter and radiuse to the console.
     */
    @Override
    public void info() {
        double flaeche = flaeche();
        double umfang  = umfang();
        System.out.println("Fläche: " + flaeche + "mm²");
        System.out.println("Umfang: " + umfang + "mm");
        System.out.println("Radius: " + radius + "mm");
    }
}
