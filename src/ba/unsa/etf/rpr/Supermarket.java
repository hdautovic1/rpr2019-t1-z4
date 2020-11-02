package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private Artikl[] artikli=new Artikl[1000];
    int BrojArtikala=0;
    public boolean dodajArtikl(Artikl a) {
        if(BrojArtikala<1000){
            artikli[BrojArtikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            BrojArtikala++;
            return true;
        }
     return false;
    }

    public Artikl[] getArtikli() {
    return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<BrojArtikala;i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                for(int j=i;j<BrojArtikala;j++){
                    artikli[j]=artikli[j+1];
                }
                artikli[BrojArtikala]=null;
                BrojArtikala--;
                return novi;
            }
        }return null;
    }
}
