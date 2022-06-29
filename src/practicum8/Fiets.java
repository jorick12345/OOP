package practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;
    public Fiets(String type,double nieuwprijs,int bouwjaar,int framenummer){
        super(type, nieuwprijs, bouwjaar);
        this.framenummer=framenummer;
    }

    public double huidigeWaarde() {
        int huidigjaar = LocalDate.now().getYear();
        int p = huidigjaar-bouwjaar;
        double nieuwwaarde = 0;

        nieuwwaarde = nieuwprijs*Math.pow(0.9,p);

        double nieuwwaarde1=Math.round(nieuwwaarde * 100.0) / 100.0;
        return nieuwwaarde1;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Fiets) {
            Fiets andereVoertuig = (Fiets) obj;
            if (this.framenummer == andereVoertuig.framenummer) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
