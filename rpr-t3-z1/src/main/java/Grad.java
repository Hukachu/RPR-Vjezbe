public enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    BIHAC("037"),
    TRAVNIK("030"),
    ORASJE("031"),
    MOSTAR("O36"),
    GORAZDE("038"),
    SIROKIBRIJEG("039");

    private String pozivniBroj;
    Grad(String pozivniBroj){
        this.pozivniBroj = pozivniBroj;
    }
    public static Grad izPozivnog(String pozivni){
        for(Grad g : Grad.values()){
            if(g.getPozivniBroj().equals(pozivni))
                return g;
        }
        return null;
    }
    public String getPozivniBroj(){
        return pozivniBroj;
    }
}
