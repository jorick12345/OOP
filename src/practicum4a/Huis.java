package practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres,int bouwjaar){
        this.adres=adres;
        this.bouwjaar=bouwjaar;
    }
    public void setHuisbaas(Persoon huisbaas){
        this.huisbaas=huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }
    public String toString(){
        String s = "Huis "+ adres+" is gebouwd in "+bouwjaar+" en heeft huisbaas "+ huisbaas;
        return s;
    }
}

