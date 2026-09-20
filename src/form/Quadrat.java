package form;

public class Quadrat extends Form {

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
     * Builds the info string of the square.
     * Format: (Klassenname): (Seite in mm), (Fläche in mm²), (Fläche int in HEX), (Umfang in mm)
     * @return info string of the square
     */
    @Override
    public String info() {
        return "Quadrat: " + seite + ", " + gerundet(flaeche())
                + ", " + flaecheAlsHex() + ", " + gerundet(umfang());
    }
}
