package ADopgave3;

public class LuchtvaartMaatschappij {
    private String naam;
    private Arraylist<Vliegtuig> vliegtuigen;

    public LuchtvaartMaatschappij(String naam){
        this.naam=naam;
    }
    public void addvliegtuig(Vliegtuig vt){
        vliegtuigen.add(vt);
    }
    public Arraylist<Vliegtuig> geefVliegtuigen(){
        this.vliegtuigen=vliegtuigen;
    }
}
