package practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        this.naam=nm;
    }

    public String getNaam(){
        return naam;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String toString(){
        String s = naam +" heeft cijfer:"+ cijfer+"\n";
        return s;
    }
}
