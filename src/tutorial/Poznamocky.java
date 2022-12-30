package tutorial;

import java.util.Scanner;

public class Poznamocky {
    public static void main(String[] args) {


        // comment
        // class - Contains everything - has members
        // methods - do something
        // arguments - What you pass to a method
        // parameter - variables to store arguments
        // statements - telling to computer something
        // properties - store something
        // access modifier (public) - who can use?
        // static - no instance of class is needed
        // object - instance of a class


        System.out.println("Aké je tvoje meno?");
        Scanner scanner = new Scanner(System.in);
        String meno = scanner.nextLine();
        System.out.println("Tvoje meno je " + meno);
    }
}
