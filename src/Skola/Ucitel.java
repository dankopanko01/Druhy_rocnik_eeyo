package Skola;

public class Ucitel extends Ziak {
    private String predmet;

    public Ucitel(String meno, String priezvisko, int vek, Enum pohlavie, String trieda, String predmet) {
        super(meno, priezvisko, vek, pohlavie, trieda);
        this.predmet = predmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}

