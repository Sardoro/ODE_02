package Rechteck;
import java.util.Scanner;

public class Rechteck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eingabeLaenge;
        String eingabeBreite;
        //Programm erwartet einen String
        System.out.print("Geben Sie die Länge an: ");
        eingabeLaenge = scan.next();
        System.out.print("Geben Sie die Breite an: ");
        eingabeBreite = scan.next();
        scan.close();
        try {
            //Eingabe in String werden in double umgewandelt
            //Hier bekommen wir NumberFormatExtension, wenn wir etwas anderes als eine Zahl eingeben.
            double breite = Double.parseDouble(eingabeLaenge);
            double laenge = Double.parseDouble(eingabeBreite);

            double umfang = (laenge + breite) * 2;
            double flaeche = laenge * breite;
            //Ausgabe
            System.out.println("Umfang: " + umfang);
            System.out.println("Fläche: " + flaeche);
        }catch (NumberFormatException e){
            //System.out.println("Fehler: Bitte geben Sie nur Zahlen ein.");
            System.err.println("Fehler: Bitte geben Sie nur Zahlen ein.");

        }

    }
}
