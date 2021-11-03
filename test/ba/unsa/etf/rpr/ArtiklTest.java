package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Jakna",60,"abc");
        assertEquals("Jakna",a.getNaziv());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Jakna",60,"abc");
        assertEquals("abc",a.getKod());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Jakna",60,"abc");
        assertEquals(60,a.getCijena());
    }
}