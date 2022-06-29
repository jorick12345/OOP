package practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;


    public Auto(String type,double nieuwprijs, int bouwjaar,String kenteken){
        super(type,nieuwprijs,bouwjaar);
        this.kenteken=kenteken;
    }

    public double huidigeWaarde() {
        int huidigjaar = LocalDate.now().getYear();
        int p = huidigjaar-bouwjaar;
        double nieuwwaarde = 0;
        for (int i=0;i<p+1;i++){
            nieuwwaarde += nieuwprijs*Math.pow(0.6,i);
        }
        double nieuwwaarde1=Math.round(nieuwwaarde * 100.0) / 100.0;
        return nieuwwaarde1;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Auto) {
            Auto andereAuto = (Auto) obj;
            if (this.kenteken.equals(andereAuto.kenteken)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
