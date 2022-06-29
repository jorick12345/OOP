package ADopgave3;

public class VliegtuigType {
    private String code;
    private Integer capaciteit;
    private Fabrikant fabrikant;

    public VliegtuigType(Fabrikant fabrikant,String code,Integer capaciteit){
        this.code=code;
        this.capaciteit;
        this.fabrikant=fabrikant;
    }
    public Integer geefCapaciteit(){
        return this.capaciteit;
    }
}
