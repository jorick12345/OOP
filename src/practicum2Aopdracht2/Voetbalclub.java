package practicum2Aopdracht2;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;



    public Voetbalclub(String nm){
        if (nm == "" || nm==null)
            this.naam="fc";
        else
            this.naam=nm;
    }
    public int aantalGespeeld(){
        int aantalGespeeld =  aantalGewonnen + aantalGelijk + aantalVerloren;
        return aantalGespeeld;
    }

    public int getGewonnen(){
        return aantalGewonnen;
    }
    public int getVerloren(){
        return aantalVerloren;
    }
    public int getGelijk(){
        return aantalGelijk;
    }
    public String getNaam(){ return naam;}
    public void setNaam(String naam){
            this.naam=naam;

    }



    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        else
            aantalGewonnen=aantalGewonnen;
            aantalGelijk=aantalGelijk;
            aantalVerloren=aantalVerloren;

    }

    public int aantalPunten(){
        int x = aantalGewonnen * 3;
        int y = aantalGelijk * 1;
        int aantalPunten = x + y;
        return aantalPunten;


    }


    public String toString() {
        return naam+
                  " "+aantalGespeeld() +" "+
                  aantalGewonnen +" "+
                  aantalGelijk +" "+
                  aantalVerloren+" "
                +  aantalPunten();

    }
}
