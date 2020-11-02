package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Artikl art =new Artikl("jabuka",20,"34");
        Supermarket s = new Supermarket();
        assertTrue(s.dodajArtikl(art));
    }
    @Test
    void TestPrekoracenjaod1000() {
        Supermarket s = new Supermarket();
        for(int i=0;i<1000;i++){
            Artikl art =new Artikl("jabuka",20,"i");
            s.dodajArtikl(art);
        }
        Artikl a =new Artikl("jabuka",20,"2190");
        assertFalse(s.dodajArtikl(a));

    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl art =new Artikl("jabuka",20,"34");
        Supermarket s = new Supermarket();
        s.dodajArtikl(art);
        Artikl pronadjen = s.izbaciArtiklSaKodom("34");
        if(pronadjen.getKod().equals(art.getKod())){
            System.out.println("Uspjesan");
        }else System.out.println("Neuspjesan");
    }
}