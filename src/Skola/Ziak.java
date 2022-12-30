package Skola;

public class Ziak extends Clovek{
    private String trieda;

    public Ziak(String meno, String priezvisko, int vek, Enum pohlavie, String trieda) {
        super(meno, priezvisko, vek, pohlavie);
        this.trieda = trieda;
    }

    public String getTrieda() {
        return trieda;
    }

    public void setTrieda(String trieda) {
        this.trieda = trieda;
    }
}
