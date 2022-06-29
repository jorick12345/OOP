package practicum4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam){
        this.naam=naam;
    }
    public void setKorting(double kP){
        this.kortingsPercentage=kP;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString(){
        String s = "op naam van:"+naam+" (korting:"+kortingsPercentage+")";
        return s;
    }
}
