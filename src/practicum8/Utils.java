package practicum8;

public class Utils {
    private int precisie;
    private double bedrag;
    private static int totaal = 0;


    public static String euroBedrag(double bedrag) {

        return euroBedrag(bedrag,2);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        totaal++;
        return String.format("€ %."+precisie+"f", bedrag);
    }

    public static int getAantalAangeroepen(){
        return totaal;

    }
}
