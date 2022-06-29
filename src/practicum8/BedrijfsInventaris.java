package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {

    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();


    public BedrijfsInventaris(String bN,double bG){
        this.bedrijfsnaam=bN;
        this.budget=bG;
    }

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g) || budget >= g.huidigeWaarde()){
            alleGoederen.add(g);
            }


    }

    public String toString(){
        String s =""+"\n";
        for(Goed g : alleGoederen){
            s+=g+"\n";
        }
        return s;

    }





}
