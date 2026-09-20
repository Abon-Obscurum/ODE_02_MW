package fhtw.form;

public class Quadrat implements Form {

    /** Seite in mm, defaults to 2mm*/
    private int seite = 2;

    /**
     * Creates Quadrat with given side.
     * Has 0 check for side so fall back is kept.
     * @param seite side in mm, must be grater than 0;
     */
    public Quadrat(int seite) {
        if(seite > 0){
            this.seite = seite;
        }else{
            System.out.println("Seite must be bigger then 0, fallback value is 2");
        }
    }

    /**
     * Creates Quadtrat with default side 2mm
     */
    public Quadrat(){

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
     * @return seite in mm
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
        flaeche = seite * seite;
        return flaeche;
    }

    /**
     * Calculates perimeter
     * @return perimeter in mm
     */
    @Override
    public double umfang() {
        double umfang;
        umfang = 4 * seite;
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
