package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Artikl art =new Artikl("jabuka",20,"34");
        Korpa k = new Korpa();
        assertTrue(k.dodajArtikl(art));
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Artikl art =new Artikl("jabuka",20,"34");
        Korpa k = new Korpa();
        k.dodajArtikl(art);

        Artikl pronadjen=k.izbaciArtiklSaKodom("34");
        if(pronadjen.getKod()==art.getKod()){
            System.out.println("Uspjesan test");
        } else System.out.println("Neuspjesan");
    }
    @org.junit.jupiter.api.Test
    void TestPrekoracenjaod50() {
        Korpa k = new Korpa();
        for(int i=0;i<50;i++){
            Artikl art =new Artikl("jabuka",20,"i");
            k.dodajArtikl(art);
        }
        Artikl a =new Artikl("jabuka",20,"219");
        assertFalse(k.dodajArtikl(a));

    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala() {
        Artikl art1 =new Artikl("jabuka",20,"34");
        Artikl art2 =new Artikl("jabuka",20,"43");
        Artikl art3 =new Artikl("jabuka",20,"44");
        Artikl art4 =new Artikl("jabuka",20,"45");
        Artikl art5 =new Artikl("jabuka",20,"56");
        Artikl art6 =new Artikl("jabuka",20,"65");
        Artikl art7 =new Artikl("jabuka",20,"52");
        Korpa k = new Korpa();
        k.dodajArtikl(art1);
        k.dodajArtikl(art2);
        k.dodajArtikl(art3);
        k.dodajArtikl(art4);
        k.dodajArtikl(art5);
        k.dodajArtikl(art6);
        k.dodajArtikl(art7);
        assertEquals(140,k.dajUkupnuCijenuArtikala());

    }
}