package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.tricks.*;

/**
 * Die Main-Klasse des Projekts. Trainiert den Hund.
 *
 */
public class App 
{
  public static void main(String[] args) {

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
    bello.macheKunststuecke(10);

  }
}
