package form;

public class Rechteck extends Form {

    /** Laenge in mm, defaults to 2mm */
    private double laenge = 2;

    /** Breite in mm, defaults to 2mm */
    private double breite = 2;

    /**
     * Creates Rechteck with given length and width.
     * Has 0 check for both sides so fall back is kept.
     * @param laenge length in mm, must be greater than 0
     * @param breite width in mm, must be greater than 0
     */
    public Rechteck(double laenge, double breite) {
        if (laenge > 0) {
            this.laenge = laenge;
        } else {
            System.out.println("Laenge must be bigger then 0, fallback value is 2");
        }
        if (breite > 0) {
            this.breite = breite;
        } else {
            System.out.println("Breite must be bigger then 0, fallback value is 2");
        }
    }

    public Rechteck() {
    }

    /**
     * Set length
     * Has 0 check for length so fall back is kept.
     * @param laenge new length in mm, must be greater than 0
     */
    public void setLaenge(double laenge) {
        if (laenge > 0) {
            this.laenge = laenge;
        } else {
            System.out.println("Laenge must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Set width
     * Has 0 check for width so fall back is kept.
     * @param breite new width in mm, must be greater than 0
     */
    public void setBreite(double breite) {
        if (breite > 0) {
            this.breite = breite;
        } else {
            System.out.println("Breite must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Returns length
     * @return length in mm
     */
    public double getLaenge() {
        return laenge;
    }

    /**
     * Returns width
     * @return width in mm
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Calculates area
     * @return area in mm²
     */
    @Override
    public double flaeche() {
        return laenge * breite;
    }

    /**
     * Calculates perimeter
     * @return perimeter in mm
     */
    @Override
    public double umfang() {
        return (laenge + breite) * 2;
    }

    /**
     * Builds the info string of the rectangle.
     * Two internal vars, so both are printed as "laengexbreite".
     * @return info string of the rectangle
     */
    @Override
    public String info() {
        return "Rechteck: " + gerundet(laenge) + "x" + gerundet(breite)
                + ", " + gerundet(flaeche())
                + ", " + flaecheAlsHex() + ", " + gerundet(umfang());
    }
}