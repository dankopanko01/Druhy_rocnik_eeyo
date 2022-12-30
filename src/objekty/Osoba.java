package objekty;

public class Osoba {    //velke prve pismeno

    private String meno;
    private String priezvisko;
    private int vek;

    public Osoba (String meno, String priezvisko, int vek) {       //nauc sa syntax(ako sa to pise) presne
        this.meno = meno;
        this.priezvisko = priezvisko;                   //musis mat v hornej zatvorke vsetky atributy, pokial zadanie nekaze inak
        this.vek = vek;                                 //this.(premenna) = (premenna)
    }

    public String getMeno() {                   //getter meno vypisuje
        return meno;
    }
    public String getPriezvisko(){
        return priezvisko;
    }
    public int getVek(){
        return vek;
    }

    public void setMeno(String meno) {          //setter meno prepisuje
        this.meno = meno;
    }
    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
}
