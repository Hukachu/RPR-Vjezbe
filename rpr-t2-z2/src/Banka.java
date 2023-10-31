import java.util.*;

public class Banka {
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka(){
        korisnici = null;
        uposlenici = null;
    }
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik a = new Korisnik(ime,prezime);
        korisnici.add(a);
        return a;
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik a  = new Uposlenik(ime, prezime);
        uposlenici.add(a);
        return a;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik a){
        Racun novi = new Racun();
        a.dodajRacun(novi);
        return novi;
    }
}
