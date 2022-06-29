package practicum8;

import java.time.LocalDate;
import java.util.Objects;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String t,String mA,double aP,int pJ){
        this.type = t;
        this.macAdres = mA;
        this.aanschafPrijs = aP;
        this.productieJaar = pJ;

    }

    public double huidigeWaarde(){
        int huidigjaar = LocalDate.now().getYear();
        int p = huidigjaar-productieJaar;
        double nieuwwaarde = 0;
        for (int i=0;i<p+1;i++){
            nieuwwaarde += aanschafPrijs*Math.pow(0.6,i);
        }
        double nieuwwaarde1=Math.round(nieuwwaarde * 100.0) / 100.0;

        return nieuwwaarde1;

    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false;

        if(obj instanceof Computer ){
            Computer andereComputer = (Computer) obj;

            if(this.type.equals(andereComputer.type) && this.macAdres.equals(andereComputer.macAdres) && this.aanschafPrijs == andereComputer.aanschafPrijs
            && this.productieJaar == andereComputer.productieJaar){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString(){
        String s = "type computer: "+ type+" waarde is "+huidigeWaarde();
        return s;
    }

}
