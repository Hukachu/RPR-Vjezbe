package ba.unsa.etf.rpr.lv7.lv7;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import static javafx.collections.FXCollections.observableArrayList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici;
    private SimpleObjectProperty trenutni;

    public KorisniciModel(){
        korisnici=observableArrayList();
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Object getTrenutni() {
        return trenutni.get();
    }

    public SimpleObjectProperty trenutniProperty() {
        return trenutni;
    }

    public void setTrenutni(Object trenutni) {
        this.trenutni.set(trenutni);
    }


}
