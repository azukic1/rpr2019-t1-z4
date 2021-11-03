package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl1() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mlijeko", 2, "123");
        boolean jeLiDodan = k.dodajArtikl(a);
        assertAll(
                ()->{
                    assertEquals("123",k.getArtikli()[0].getKod());
                    assertTrue(jeLiDodan);
                }
        );

    }
    @Test
    void dodajArtikl2() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mlijeko", 2, "123");
        for(int i = 0; i<1000; i++) k.dodajArtikl(a);
        assertFalse(k.dodajArtikl(a));

    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom1() {
        Artikl a = new Artikl("Mlijeko", 2, "123");
        Artikl b = new Artikl("Voda", 1, "456");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.izbaciArtiklSaKodom("123");
        assertEquals("456",k.getArtikli()[0].getKod());
    }
    @Test
    void izbaciArtiklSaKodom2() {
        Artikl a = new Artikl("Mlijeko", 2, "123");
        Artikl b = new Artikl("Voda", 1, "456");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertNull(k.izbaciArtiklSaKodom("aaa"));

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl a = new Artikl("Jakna", 50, "asd");
        Artikl b = new Artikl("Biciklo", 1200, "fgh");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals(1250,k.dajUkupnuCijenuArtikala());

    }
}