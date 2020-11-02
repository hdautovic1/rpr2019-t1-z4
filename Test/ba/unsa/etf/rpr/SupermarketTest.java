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
    void izbaciArtiklSaKodom() {
        Artikl art =new Artikl("jabuka",20,"34");
        Supermarket s = new Supermarket();
        s.dodajArtikl(art);
        Artikl pronadjen = s.izbaciArtiklSaKodom("34");
        if(pronadjen.getKod()==art.getKod()){
            System.out.println("Uspjesan");
        }else System.out.println("Neuspjesan");
    }
}