package Skola;

public class Clovek {                          // clovek ma 4 atributy
        private String meno;                //meno je atribut!
        private String priezvisko;
        private int vek;
        private Enum Pohlavie;

        /* bezparametricky konstruktor
        public Clovek() {
        }

         */


        //skratka na automaticke vytvorenie konstruktora, getterov, setterov   ->    alt + insert
        //vybrat vsetko

        public Clovek(String meno, String priezvisko, int vek, Enum pohlavie) {
                this.meno = meno;
                this.priezvisko = priezvisko;
                this.vek = vek;
                Pohlavie = pohlavie;
        }

        public String getMeno() {
                return meno;
        }

        public void setMeno(String meno) {
                this.meno = meno;
        }

        public String getPriezvisko() {
                return priezvisko;
        }

        public void setPriezvisko(String priezvisko) {
                this.priezvisko = priezvisko;
        }

        public int getVek() {
                return vek;
        }

        public void setVek(int vek) {
                this.vek = vek;
        }

        public Enum getPohlavie() {
                return Pohlavie;
        }

        public void setPohlavie(Enum pohlavie) {
                Pohlavie = pohlavie;
        }
}
