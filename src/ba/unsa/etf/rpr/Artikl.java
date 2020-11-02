package ba.unsa.etf.rpr;

public class Artikl {
    private String Naziv;
    private String Kod;
    private int Cijena;

    public Artikl(String Naziv, int Cijena, String Kod) {
        this.Naziv=Naziv;
        this.Cijena=Cijena;
        this.Kod=Kod;
    }


    public String getNaziv() {
        return Naziv;
    }
    public String getKod() {
        return  Kod;
    }
    public int getCijena() {
        return Cijena;
    }
}
