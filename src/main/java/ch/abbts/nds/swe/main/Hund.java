package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.tricks.Kunststueck;
import java.util.ArrayList;

public class Hund {

    private final int gewicht;
    private String fellfarbe;
    private String name;
    private String rasse;

    private final ArrayList<Kunststueck> tricks = new ArrayList();

    public Hund (int gewicht)
    { // der Konstruktor
        this.gewicht = gewicht;
    }

    public void setFellfarbe (String farbe)
    {
        fellfarbe = farbe;
    }

    public void setName (String pName)
    {
        name = pName;
    }

    public void setRasse (String pRasse)
    {
        rasse = pRasse;
    }

    @Override
    public String toString ()
    {
        return "Hund: " + "gewicht = " + gewicht + " kg";
    }

    public void uebeKunststueck (Kunststueck trick)
    {
        tricks.add(trick);
    }

    /**
     * Der Hund macht eime bestimmte Anzahl Kunststuecke. Er wählt diese 
     * zufaellig aus den gelernten Tricks aus.
     * @param number Anzahl der zu machenden Kunststuecke
     */
    public void macheKunststuecke (int number)
    {
        int range = tricks.size();
        for( int i = 0; i < number; i++ ){
            int trickNr = (int) (Math.random() * range);
            System.out.println(tricks.get(trickNr).machKunststück());
        }
    }

    public void gibLaut (int anzahl)
    {
        for( int i = 0; i < anzahl; i++ ){
            gibLautNachGewicht();
        }
    }

    private void gibLautNachGewicht ()
    {
        if (gewicht < 5) {
            System.out.println("Kläff");
        } else {
            System.out.println("Wuff");
        }
    }

}
