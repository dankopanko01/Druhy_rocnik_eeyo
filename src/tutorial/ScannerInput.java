package tutorial;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputOdUzivatela = sc.nextLine();
        System.out.println(inputOdUzivatela);

        int integer = sc.nextInt();
        System.out.println(integer + 10 );
    }
}
