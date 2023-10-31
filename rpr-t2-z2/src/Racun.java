public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    public boolean provjeriOdobrenjePrekoracenja(Double odobrenje){
        if(odobrenje > 1000) return false;
        return true;
    }
    public boolean izvrsiUplatu(Double uplata){
        stanjeRacuna = uplata + stanjeRacuna;
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata){
        if(isplata > stanjeRacuna)
            if(provjeriOdobrenjePrekoracenja(isplata - stanjeRacuna)) {
                stanjeRacuna = stanjeRacuna - isplata;
                odobriPrekoracenje(isplata);
            }
            else {
                System.out.println("Isplata nije moguca");
                return false;
            }
        return true;
    }
    public void odobriPrekoracenje(Double prekoracenje){
        odobrenjePrekoracenja = true;
    }
}
