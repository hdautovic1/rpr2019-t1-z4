package ba.unsa.etf.rpr;

public class Korpa {
       private  Artikl[] artikli = new Artikl[50];
       private int BrojArtikala = 0;


    public boolean dodajArtikl(Artikl a) {
        if(BrojArtikala < 50){
            artikli[BrojArtikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            BrojArtikala++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return  artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<BrojArtikala;i++){
            if(kod.equals(artikli[i].getKod())){
                Artikl pronadjen = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                for(int j=i;j<BrojArtikala;j++){
                    artikli[j]=artikli[j+1];
                }
                artikli[BrojArtikala]=null;
                BrojArtikala--;
                return pronadjen;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int Ukupna=0;
        for(int i=0;i<BrojArtikala;i++){
            Ukupna+=artikli[i].getCijena();
        }
        return Ukupna;
    }
}
