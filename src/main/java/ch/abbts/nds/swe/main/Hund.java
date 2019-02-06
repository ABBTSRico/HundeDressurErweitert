package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.tricks.Kunststueck;
import java.util.ArrayList;

public class Hund {            
  private final int gewicht;
  private final ArrayList<Kunststueck> tricks = new ArrayList();
  
  public Hund(int gewicht) { // der Konstruktor
    this.gewicht = gewicht;
  }

  @Override
  public String toString() {
    return "Hund: " + "gewicht = " + gewicht + " kg";
  }

  public void uebeKunststueck(Kunststueck trick) {
      tricks.add(trick);
  }
  
  public void macheKunststuecke() {
      for (Kunststueck trick : tricks) {
          System.out.println(trick.machKunststück());
      }
  }
  
  public void gibLaut(int anzahl) {
    for(int i = 0; i < anzahl; i++) {
      gibLautNachGewicht();
    }
  }

  private void gibLautNachGewicht() {
    if(gewicht < 5) {     
      System.out.println("Kläff");
    }
    else {
      System.out.println("Wuff");
    }
  }

}