package practicum7;

public class VervangProces implements OpmaakProces {
    private String nieuw;
    private String oud;


    public VervangProces(String oud, String nieuw){
        this.nieuw=nieuw;
        this.oud=oud;
    }

    public String MaakOp(String input){
        return input.replaceAll(this.oud,this.nieuw);

    }
}
