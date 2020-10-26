package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] niz;
    private int BrojClanova;

    public Korpa() {
        BrojClanova=0;
    }

    public boolean dodajArtikl(Artikl a) {
        niz[BrojClanova]=a;
        BrojClanova++;

    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<BrojClanova;i++){
            suma=suma+ niz[i].getCijena();
        }
    }
}
