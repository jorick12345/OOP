package practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){

    }

    public void setAantalDagen(int aD){
        this.aantalDagen=aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto=gA;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public void setHuurder(Klant huurder){
        this.huurder=huurder;
    }

    public Klant getHuurder() {
        return huurder;
    }
    public double totaalPrijs(){
        double p = 0;
        if(huurder==null || gehuurdeAuto==null)
            return 0;
        else
            p += gehuurdeAuto.getPrijsPerDag() - gehuurdeAuto.getPrijsPerDag()*(huurder.getKorting()/100);
        return aantalDagen*p;
    }
    public String toString(){
        String fout1="";
        String fout2="";

        if (huurder==null){
            fout1 += "er is geen huurder bekend";}
        else{
            fout1 += huurder.toString();
        }
        if (gehuurdeAuto==null){
            fout2 += "er is geen auto bekend";}
        else{
            fout2 += gehuurdeAuto.toString();
        }

        String s = fout1+"\n"+fout2+"\n"+"aantal dagen: "+ aantalDagen+ " en dat kost: "+totaalPrijs();
        return s;


    }

}
