package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.exceptions.HungerException;
import ch.abbts.nds.swe.tricks.*;

/**
 * Die Main-Klasse des Projekts. Trainiert den Hund.
 *
 */
public class App {

    public static void main (String[] args)
    {

        // Objekte erzeugen und Membervariable initialisieren
        Hund fido = new Hund(4);
        Hund bello = new Hund(12);

        // Methoden auf den Objekten aufrufen
        fido.gibLaut(2);
        bello.gibLaut(1);
        System.out.println(fido);
        System.out.println(bello);

        bello.uebeKunststueck(new Sitz("Sitz"));
        bello.uebeKunststueck(new Bring("Bring"));

        System.out.println("Ich kann folgende Kunststücke: \n" + bello.getKunststuecke());
        
        // Ersatzmethode, damit auf Ecxception reagiert werden kanns
        App.macheKunststuecke(bello, 10);
    }

    /**
     * Macht die erfoderliche Anzahl Kunststuecke. Da der Hund nach 6 Tricks
     * gefüttert werden muss (angezeigt durch Excpetion), wird die entsprechende
     * Methode in der Klasse Hund einfach entsprechend oft aufgreufen.
     * @param hund Der Hund, der Kunststuecke machen soll
     * @param anzahl Wie viele Kunststuecke gemacht werden sollen.
     */
    static void macheKunststuecke (Hund hund, int anzahl)
    {
        for( int i = 0; i < anzahl; i++ ){
            try {
                hund.macheKunststuecke(1);
            } catch (HungerException ex) {
                System.out.println("Füttere mich!");
                hund.fuettern(6);
            }
        }
    }
}
