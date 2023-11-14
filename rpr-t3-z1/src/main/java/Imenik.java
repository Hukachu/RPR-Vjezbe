import java.util.*;
import java.lang.*;
import java.util.Map.Entry;

public class Imenik {

    private Map<String, TelefonskiBroj> mapa;

    public Imenik(){
        this.mapa = new HashMap<String, TelefonskiBroj>();
    }

    public Map<String, TelefonskiBroj> getMapa() {
        return mapa;
    }

    public void setMapa(Map<String, TelefonskiBroj> mapa) {
        this.mapa = mapa;
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        this.mapa.put(ime,broj);
    }
    public String dajBroj(String ime){
        TelefonskiBroj a = mapa.get(ime);
        if(a != null)
            return a.ispisi();
        else
            return null;
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> i : mapa.entrySet()) {
            if (i.getValue().ispisi().equals(broj.ispisi()))
                return i.getKey();
        }
        return null;
    }
    public String naSlovo(char s){
        StringBuilder builder = new StringBuilder();

        int brojac = 1;
        for(Map.Entry<String,TelefonskiBroj> i : mapa.entrySet()){
            if(i.getKey().startsWith(String.valueOf(s))){
                builder.append(brojac)
                        .append(". ")
                        .append(i.getKey())
                        .append(" - ")
                        .append(i.getValue().ispisi())
                        .append(System.lineSeparator());
            }
            brojac++;
        }
        return builder.toString();
    }
    public Set<String> izGrada(Grad g){
        Set<String> temp = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> i : mapa.entrySet()) {
            if(jeLiIzGrada(i.getValue(), g)){
                temp.add(i.getKey());
            }
        }
        return temp;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> temp = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo((o2.ispisi()));
            }
        });

        for(Map.Entry<String, TelefonskiBroj> i : mapa.entrySet()){
            if(jeLiIzGrada(i.getValue(),g));
                temp.add(i.getValue());
        }
        return temp;
    }

    private boolean jeLiIzGrada(TelefonskiBroj broj, Grad g){
        if(broj instanceof FiksniBroj){
            return g.equals(((FiksniBroj)broj).getGrad());
        }
        else
            return false;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        int brojac = 1;
        for(Entry<String, TelefonskiBroj> i : mapa.entrySet()){
            builder.append(brojac)
                    .append(". ")
                    .append(i.getKey())
                    .append(" - ")
                    .append(i.getValue().ispisi())
                    .append(System.lineSeparator());
            brojac++;
        }
        return builder.toString();
    }

}
