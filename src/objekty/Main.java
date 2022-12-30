package objekty;

public class Main {
    public static void main(String[] args) {
        Osoba obejkt1 = new Osoba("tomas", "mastalir", 11);  //tvorba objetku ->
                                                                                // *nazov triedy* *nazov* = new *nazov triedy*(vsetky atributy z konstruktora)
        Osoba obejkt2 = new Osoba("tomas", "mastalir", 11);

        System.out.println(obejkt1.getMeno());
        System.out.println(obejkt1.getPriezvisko());
        System.out.println(obejkt1.getVek());

        // v osobe objekt dva zmeň priezvisko na bezdeda a potom ho vypis

        obejkt1.setPriezvisko("bezdeda");
        System.out.println(obejkt1.getPriezvisko());
    }
}
