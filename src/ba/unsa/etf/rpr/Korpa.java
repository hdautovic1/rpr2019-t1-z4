package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int BrojClanova=0;

    public boolean dodajArtikl(Artikl a) {
        if(BrojClanova<50){
            artikli[BrojClanova] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            BrojClanova++;
            return true;
        }
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<BrojClanova;i++){
            suma=suma+ artikli[i].getCijena();
        }
        return suma;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0;i<BrojClanova;i++){
            if(kod.equals(artikli[i].getKod())){
               Artikl pronadjeni=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                int j;
                for(j=i;j<BrojClanova;j++){
                    artikli[j]= artikli[j+1];
                }
                artikli[BrojClanova]=null;
                BrojClanova--;
                return pronadjeni;
            }
        } return  null;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
