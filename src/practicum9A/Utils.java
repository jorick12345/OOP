package practicum9A;

public class Utils {
    private int precisie;
    private double bedrag;
    private static int totaal = 0;


    public static String euroBedrag(double bedrag) {
        totaal++;
        String afgerond = String.format("€ %.2f", bedrag);
        return afgerond;
    }
    public static String euroBedrag(double bedrag, int precisie) {
        totaal++;
        return String.format("€ %."+precisie+"f", bedrag);
    }

    public static int getAantalAangeroepen(){
        return totaal;

    }
}
