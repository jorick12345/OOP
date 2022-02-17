package practicum2opdracht1;

public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;

    public Zwembad(double Breedte, double Lengte, double Diepte){
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;

    }
    public Zwembad(){

    }

    public double getBreedte(){
        return Breedte;

    }

    public double getDiepte() {
        return Diepte;
    }
    public double getLengte(){
        return Lengte;
    }

    public void setBreedte(double breedte){
        this.Breedte=breedte;

    }

    public void setDiepte(double diepte) {
        Diepte = diepte;
    }

    public void setLengte(double lengte) {
        Lengte = lengte;
    }

    public double inhoud(){
        double inhoud = Breedte*Lengte*Diepte;
        return inhoud;
    }
    public String toString(){
        String s = "Dit zwembad is " + Breedte + " meter breed,"+Lengte+" meter lang en,"+Diepte+ " meter diep.";
        return s;
    }
}
