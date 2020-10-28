package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private Artikl[] artikli=new Artikl[1000];
    private int BrojClanova=0;

    public boolean dodajArtikl(Artikl art) {
        if(BrojClanova<1000){
            artikli[BrojClanova] = new Artikl(art.getNaziv(),art.getCijena(),art.getKod());
        BrojClanova++;
        return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pronadjeni=null;
        for(int i=0;i<BrojClanova;i++){
            if(kod.equals(artikli[i].getKod())){
                pronadjeni=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                int j;
                for(j=i;j<BrojClanova;j++){
                    artikli[j]= artikli[j+1];
                }
                artikli[BrojClanova]=null;
                BrojClanova--;
            }
        } return  pronadjeni;
    }
}
