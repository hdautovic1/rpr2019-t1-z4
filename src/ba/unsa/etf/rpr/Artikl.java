package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv,kod;
    private int cijena;

    public Artikl() {
        naziv="";
        kod="";
        cijena=0;
    }

    public int getCijena() {
        return cijena;
    }

    public Artikl(String naziv, int i, String s) {
        this.naziv=naziv;
        cijena=i;
        kod=s;

    }
}
