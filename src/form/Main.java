package fhtw.form;

public class Main {
    public static void main(String[] args) {
        /* Array holds six shapes: two of each type */
        int arrSize = 6;
        Form[] arr = new Form[arrSize];

        arr[0] = new Kreis(50);
        arr[1] = new Kreis(100);

        arr[2] = new Quadrat(20);
        arr[3] = new Quadrat(40);

        arr[4] = new GlDreieck(15);
        arr[5] = new GlDreieck(30);

        for (int i = 0; i < arrSize; i++){

            switch (i){
                case 0:
                case 1:
                    System.out.println((i + 1) + " Kreis");
                    break;
                case 2:
                case 3:
                    System.out.println((i + 1) + " Quadrat");
                    break;
                case 4:
                case 5:
                    System.out.println( (i + 1) + " GlDreieck");
                    break;
            }
            ((Form) arr[i]).info();
            System.out.printf("\n");
        }
    }
}
