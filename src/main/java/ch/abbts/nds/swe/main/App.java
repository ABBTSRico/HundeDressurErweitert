package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.exceptions.HungerException;
import ch.abbts.nds.swe.tricks.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        bello.setName("Bello");
        bello.setRasse("Dackel");
        Logger.getLogger(App.class.getName()).log(Level.INFO, bello.toString());

        fido.gibLaut(2);
        bello.gibLaut(1);

        bello.uebeKunststueck(new Sitz("Sitz"));
        bello.uebeKunststueck(new Bring("Bring"));
        bello.uebeKunststueck(new Jump("Jump"));

        System.out.println("Ich kann folgende Kunststücke: \n" + bello.getKunststuecke());

        // Ersatzmethode, damit auf Ecxception reagiert werden kanns
        App.macheKunststuecke(bello, 10);
    }

    /**
     * Macht die erfoderliche Anzahl Kunststuecke. Da der Hund nach 6 Tricks
     * gefüttert werden muss (angezeigt durch Excpetion), wird die entsprechende
     * Methode in der Klasse Hund einfach entsprechend oft aufgreufen.
     *
     * @param hund Der Hund, der Kunststuecke machen soll
     * @param anzahl Wie viele Kunststuecke gemacht werden sollen.
     */
    static void macheKunststuecke (Hund hund, int anzahl)
    {
        for( int i = 0; i < anzahl; i++ ){
            try {
                hund.macheKunststuecke(1);
            } catch (HungerException ex) {
                Logger.getLogger(App.class.getName()).log(Level.WARNING, ex.getMessage());
                hund.fuettern(6);
            }
        }
    }
}
