package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;
    public boolean dodajArtikl(Artikl noviArtikl) {
        if(brojArtikala<50){
            artikli[brojArtikala] = new Artikl(noviArtikl.getNaziv(),noviArtikl.getCijena(),noviArtikl.getKod());
            brojArtikala++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<brojArtikala; i++) {
            if(kod.equals(artikli[i].getKod())) {
                Artikl artiklZaIzbacivanje = artikli[i];
                for (int j = i; j + 1 < brojArtikala; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brojArtikala--;
                artikli[brojArtikala] = null;
                return artiklZaIzbacivanje;
            }

        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(int i=0; i<brojArtikala; i++) {
            ukupnaCijena = ukupnaCijena + artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}
