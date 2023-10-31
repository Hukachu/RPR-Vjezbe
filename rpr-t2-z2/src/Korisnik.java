public class Korisnik extends Osoba{
    private Racun racun;
    Korisnik(String ime, String prezime){
        super(ime,prezime);
    }
    public void dodajRacun(Racun a){
        racun = a;
    }
}
