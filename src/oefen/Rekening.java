package oefen;

public class Rekening {
    private Integer nummer;
    private Double saldo;

    public Rekening(Integer nummer,Double saldo){
        this.nummer=nummer;
        this.saldo=saldo;

    }

    public int getNummer() {
        return nummer;
    }
    public double getSaldo(){
        return saldo;
    }

    public Klant getRekeninghouder() {
        return rekeninghouder;
    }

    public void setRekeninghouder(Klant rekeninghouder) {
        this.rekeninghouder = rekeninghouder;
    }

    public void neemOp(double bedrag){
        saldo -= bedrag;

    }

    public void stort(double bedrag) {
        saldo += bedrag;

    }

    public String toString(){

        String s ="Op rekening "+ nummer+ " staat "+ saldo;
        if (rekeninghouder == null)
            s+= " en de rekeninghouder is onbekend ";
        else
            s+= " end de rekeninghouder is"+ rekeninghouder.toString();
        return s;
    }
}
