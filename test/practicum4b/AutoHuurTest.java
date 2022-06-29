package practicum4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {
    private AutoHuur a;
    private Klant k1;
    private Auto waggie;


    @BeforeEach
    public void BeforeEachMethod(){
        a = new AutoHuur();
        k1 = new Klant("jorick");

    }
    @Test
    public void prijsTest(){
        k1.setKorting(10);
        a.setHuurder(k1);
        waggie =new Auto("ford",10);
        a.setGehuurdeAuto(waggie);
        a.setAantalDagen(10);
        assertEquals(90,a.totaalPrijs());


    }

    @Test
    public void prijsZonderKortingTest(){
        k1.setKorting(0);
        a.setHuurder(k1);
        waggie = new Auto("ford",10);
        a.setGehuurdeAuto(waggie);
        a.setAantalDagen(10);
        assertEquals(100,a.totaalPrijs());

    }

    @Test
    public void prijsZonderAutoTest(){
        k1.setKorting(10);
        a.setHuurder(k1);
        a.setAantalDagen(10);
        assertEquals(0,a.totaalPrijs());
    }
    @Test
    public void prijsZonderAutoEnNaamTest(){
        assertEquals(0,a.totaalPrijs());
    }


    @Test
    public void zonderKlantStringTest(){
        waggie = new Auto("ford",10);
        a.setGehuurdeAuto(waggie);
        assertEquals("er is geen huurder bekend"+"\n"+ a.getGehuurdeAuto()+ "\n" +
                "aantal dagen: 0 en dat kost: 0.0",a.toString());
    }

    @Test
    public void zonderAutoStringTest(){
        k1.setKorting(10);
        a.setHuurder(k1);
        a.setAantalDagen(10);
        assertEquals(a.getHuurder()+"\n"+"er is geen auto bekend"+"\n"+"aantal dagen: 10 en dat kost: 0.0",a.toString());

    }

    @Test
    public void zonderAutoEnZonderKlantStringTest(){
        assertEquals("er is geen huurder bekend"+"\n"+"er is geen auto bekend"+"\n"+"aantal dagen: 0 en dat kost 0.0",a.toString());
    }










}