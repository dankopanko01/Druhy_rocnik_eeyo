package tutorial;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class precvicovanie {

      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("Kolko mas rokov?");
        int cislo = scanner.nextInt();
        System.out.println("mas " + cislo + " rokov");


        hadanka kolko mas rokov

       */

        /* Vrati chybne zadane cislo

        public static int ctiI() {
            int i = 0;
            byte[] pole = new byte[10];
            boolean nacteno = false;
            do {
                try {
                    System.in.read(pole);
                    String vstup = new String(pole).trim();
                    i = Integer.valueOf(vstup).intValue();
                    nacteno = true;
                } catch (Exception e) {
                    System.out.print("Chybne, zadajte cele cislo: ");
                }
            } while (!nacteno);
            return i;
        }

        public static int ctiJ() {
            int cislo = 0;
            byte[] pole = new byte[10];
            boolean nacteno = false;
            do {
                try {
                    System.in.read(pole);
                    String vstup = new String(pole).trim();
                    cislo = Integer.valueOf(vstup).intValue();
                    nacteno = true;
                } catch (Exception e) {
                    System.out.print("Chybne, zadajte cele cislo: ");
                }
            } while (!nacteno);
            return cislo;
        }






        public static void main(String[] args){

            int cisloOperace;


            System.out.print("Zadaj 1. cislo: ");       //Zada prve cislo
            int i =ctiI();
            System.out.print("Zadaj 2. cislo: ");       //Zada druhe cislo
            int j =ctiJ();


            System.out.println("1. sčítanie čísel\n2. odčítanie čísel\n3. násobenie čísel\n4. presné delenie čísel\n"
                    + "5. celočíselné delenie\n6. Zostatok po celočíselnom delení");
            System.out.print("Zdajte číslo požadovanej operácií: ");
            cisloOperace = ctiI();

            switch(cisloOperace) {
                case 1:
                    System.out.println("Výsledok po sšítaní je: " +(i+j));
                    break;
                case 2:
                    System.out.println("Výsledok po odčítaní je: " +(i-j));
                    break;
                case 3:
                    System.out.println("Výsledok po znásobení je: " +(i*j));
                    break;
                case 4:
                    if (j == 0) {
                        System.out.println("Čsilom nula sa nedá deliť!");
                    }
                    else {
                        System.out.println("Výsledok po presnom delení je: " +((float)i/j));
                    }
                    break;
                case 5:
                    if (j==0) {
                        System.out.println("Číslom nula sa nedá deliť!");
                    }

                    else {
                        System.out.println("Výsledok po celočíselnom delení je: " +(i/j));
                    }
                    break;
                case 6:
                    if (j==0) {
                        System.out.println("Číslom nula sa nedá deliť!");
                    }

                    else {
                        System.out.println("Zostatok po celočíselnom delení je: " +(i%j));
                    }
                    break;

                default:
                    System.out.println("Chybne ste zadali číslo požadovanej operácií!");
                    break;

            }

         */


         Scanner sc = new Scanner(System.in);
         
}




