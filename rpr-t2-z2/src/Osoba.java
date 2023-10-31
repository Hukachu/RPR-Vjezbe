public class Osoba{
    private String Ime;
    private String Prezime;
    public Osoba(String ime, String prezime){
        this.Ime = ime;
        this.Prezime = prezime;
    }
    public String toString(){
        return Ime + " " + Prezime;
    }
}
