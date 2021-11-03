package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Artikl a =  new Artikl("Jakna", 60, "abc");
        Supermarket s =  new Supermarket();
        s.dodajArtikl(a);
        assertEquals(60,s.getArtikli()[0].getCijena());
    }


    @Test
    void izbaciArtiklSaKodom1() {
        Artikl a = new Artikl("Mlijeko", 2, "123");
        Artikl b = new Artikl("Voda", 1, "456");
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.izbaciArtiklSaKodom("123");
        assertEquals("456",s.getArtikli()[0].getKod());
    }
    @Test
    void izbaciArtiklSaKodom2() {
        Artikl a = new Artikl("Mlijeko", 2, "123");
        Artikl b = new Artikl("Voda", 1, "456");
        Supermarket s = new Supermarket();
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        assertNull(s.izbaciArtiklSaKodom("aaa"));

    }
}