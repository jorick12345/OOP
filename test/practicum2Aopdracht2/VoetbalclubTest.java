package practicum2Aopdracht2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    private Voetbalclub v;

    @BeforeEach
    public void beforeMethod() {
        v = new Voetbalclub("");
    }

    @Test
    public void kijkenNaamWordFC() {
        assertEquals("fc", v.getNaam());

    }

    @Test
    public void kijkenNull(){
        Voetbalclub a = new Voetbalclub(null);
        assertEquals("fc",a.getNaam());
    }

    @Test
    public void gewonnenW(){
        v.verwerkResultaat('w');
        assertEquals(3,v.aantalPunten());
        assertEquals(1,v.aantalGespeeld());
    }
    @Test
    public void gelijkG(){
        v.verwerkResultaat('g');
        assertEquals(1,v.aantalPunten());
        assertEquals(1,v.aantalGespeeld());
    }
    @Test
    public void verlorenV() {
        v.verwerkResultaat('v');
        assertEquals(0, v.aantalPunten());
        assertEquals(1, v.aantalGespeeld());

    }
    @Test
    public void checkA(){
        v.verwerkResultaat('a');
        assertEquals(0,v.aantalPunten());
        assertEquals(0,v.aantalGespeeld());
    }

    @Test
    public void stringCheckW(){
        v.verwerkResultaat('w');
        assertEquals("fc 1 1 0 0 3",v.toString());

    }
    @Test
    public void stringCheckG() {
        v.verwerkResultaat('g');
        assertEquals("fc 1 0 1 0 1",v.toString());
    }
    @Test
    public void stringCheckV() {
        v.verwerkResultaat('v');
        assertEquals("fc 1 0 0 1 0",v.toString());
    }

    @Test
    public void optelCheck1() {
        for (int i = 0; i < 100; i++) {
            v.verwerkResultaat('w');
        }
        String toString = v.toString();
        assertTrue(toString.contains("300"));


    }
    @Test
    public void optelCheck2() {
        for (int i = 0; i < 100; i++) {
            v.verwerkResultaat('w');
        }
        String toString = v.toString();
        assertTrue(toString.contains("100"));
    }



}