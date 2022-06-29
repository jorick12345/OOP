package practicum5;

import java.util.ArrayList;

public class Klas{
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();


    public Klas(String kC){
        this.klasCode=kC;
    }
    public void voegLeerlingToe(Leerling l){
        this.deLeerlingen.add(l);
    }
    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l : this.deLeerlingen){
            if(l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }


        }
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }


    public String toString(){
        String p = "In klas " + klasCode + " zitten de volgende leerlingen:"+"\n";
        for(Leerling leerling : deLeerlingen){
            p += leerling;
        }
        return p;
    }
}
