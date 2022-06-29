package practicum4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam,int leeftijd){
        this.leeftijd=leeftijd;
        this.naam=naam;
    }

//    public String getNaam(){
//        return this.naam;
//    }
//
//    public int getLeeftijd(){
//        return this.leeftijd;
//    }
    public String toString(){
        String s = naam+"; "+ "leeftijd " + leeftijd+ " jaar";
        return s;
    }
}
