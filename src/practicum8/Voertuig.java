package practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type,double nieuwprijs,int bouwjaar){
        this.type=type;
        this.nieuwprijs=nieuwprijs;
        this.bouwjaar=bouwjaar;
    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;

        if(obj instanceof Voertuig){
            Voertuig andereVoertuig = (Voertuig) obj;
            if(this.type.equals(andereVoertuig.type) && this.nieuwprijs == andereVoertuig.nieuwprijs && this.bouwjaar==andereVoertuig.bouwjaar){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;

    }

    public String toString(){
        String s= "Voertuig:"+ type+ " met bouwjaar "+bouwjaar+" heeft een waarde van: "+ huidigeWaarde();
        return s;
    }


}
