package practicum6a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releasejaar;
    private double nieuwprijs;

    public Game(String nm, int releasjaar, double nieuwprijs){
        this.naam=nm;
        this.releasejaar=releasjaar;
        this.nieuwprijs=nieuwprijs;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        int huidigjaar = LocalDate.now().getYear();
        int p = huidigjaar-releasejaar;
        double nieuwwaarde = 0;
        for (int i=0;i<=p;i++){
            nieuwwaarde = nieuwprijs*Math.pow(0.7,i);
        }
        return nieuwwaarde;
    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;

        if(obj instanceof Game ){
            Game andereGame = (Game) obj;

            if(this.naam.equals(andereGame.naam) && this.releasejaar == andereGame.releasejaar ){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString(){
        String s = naam+", uitgegeven in "+releasejaar+"; nieuwprijs: €"+ String.format("%.2f", nieuwprijs)+" nu voor: €"+ String.format("%.2f", huidigeWaarde());
        return s;
    }
}
