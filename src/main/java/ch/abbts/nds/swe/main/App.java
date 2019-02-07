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

        // Methoden auf den Objekten aufrufen
        fido.gibLaut(2);
        bello.gibLaut(1);
        System.out.println(fido);
        System.out.println(bello);

        bello.uebeKunststueck(new Sitz("Sitz"));
        bello.uebeKunststueck(new Bring("Bring"));

        System.out.println("Ich kann folgende Kunststücke: \n" + bello.getKunststuecke());
        try {
            bello.macheKunststuecke(10);
        } catch (HungerException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
