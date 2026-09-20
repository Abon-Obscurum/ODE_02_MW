package form;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /* TreeMap sorts by key on its own, area is used as key */
        TreeMap<Double, Form> formen = new TreeMap<>();

        /* Two objects per class: one default, one with parameters */
        Form kreisDefault    = new Kreis();
        Form kreisParameter  = new Kreis(50);

        Form quadratDefault   = new Quadrat();
        Form quadratParameter = new Quadrat(20);

        Form dreieckDefault   = new GlDreieck();
        Form dreieckParameter = new GlDreieck(15);

        /* Key is the area, value is the shape itself */
        formen.put(kreisDefault.flaeche(), kreisDefault);
        formen.put(kreisParameter.flaeche(), kreisParameter);
        formen.put(quadratDefault.flaeche(), quadratDefault);
        formen.put(quadratParameter.flaeche(), quadratParameter);
        formen.put(dreieckDefault.flaeche(), dreieckDefault);
        formen.put(dreieckParameter.flaeche(), dreieckParameter);

        /* values() already comes in key order, small to big */
        for (Form f : formen.values()) {
            System.out.println(f.info());
        }

        System.out.printf("\n");

        /* lastEntry() gives the biggest key, no loop needed */
        System.out.println(formen.lastEntry().getValue().info());
    }
}