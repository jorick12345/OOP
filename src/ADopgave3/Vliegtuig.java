package ADopgave3;

import java.time.LocalDate;

public class Vliegtuig {
    private String naam;
    private LocalDate datumInGebruik;
    private LuchtvaartMaatschappij lvm;
    private VliegtuigType vliegtuigType;

    public Vliegtuig(LuchtvaartMaatschappij lvm){
        this.lvm=lvm;
    }
    private void setVliegtuigType(VliegtuigType vliegtuigType){
        this.vliegtuigType=vliegtuigType;

    }
    private LocalDate geefDatumInGebruik(){
        return this.datumInGebruik;
    }
    public void bewaar(){

    }




}
