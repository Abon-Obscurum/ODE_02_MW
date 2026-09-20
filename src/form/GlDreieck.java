package fhtw.form;

/**
 * Equilateral triangle, defined by its side length.
 * All three sides are of equal length.
 */
public class GlDreieck implements Form{

    /** Seite in mm, defaults to 2mm*/
    private int seite = 2;

    /**
     * Creates Dreieck with given side.
     * Has 0 check for side so fall back is kept.
     * @param seite side in mm, must be grater than 0;
     */
    public GlDreieck(int seite) {
        if(seite > 0){
            this.seite = seite;
        }else{
            System.out.println("Seite must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Creates Dreieck with default side 2mm
     */
    public GlDreieck() {
    }

    /**
     * Set side
     * Has 0 check for side so fall back is kept.
     * @param seite new side in mm, mus be greater than 0
     */
    public void setSeite(int seite) {
        if(seite > 0){
            this.seite = seite;
        }else{
            System.out.println("Seite must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Returns side
     * @return side in mm
     */
    public int getSeite() {
        return seite;
    }

    /**
     * Calculates area
     * @return are in mm²
     */
    @Override
    public double flaeche() {
        double flaeche;
        flaeche = (Math.sqrt(3) / 4) * seite * seite;
        return flaeche;
    }

    /**
     * Calculates perimeter
     * @return perimeter in mm
     */
    @Override
    public double umfang() {
        double umfang;
        umfang = 3 * seite;
        return umfang;
    }

    /**
     * Prints area, perimeter and side to the console.
     */
    @Override
    public void info() {
        double flaeche = flaeche();
        double umfang  = umfang();
        System.out.println("Fläche: " + flaeche + "mm²");
        System.out.println("Umfang: " + umfang + "mm");
        System.out.println("Seite: " + seite + "mm");
    }

}
