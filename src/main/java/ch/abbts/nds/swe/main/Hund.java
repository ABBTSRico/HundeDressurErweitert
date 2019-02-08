package ch.abbts.nds.swe.main;

import ch.abbts.nds.swe.exceptions.HungerException;
import ch.abbts.nds.swe.tricks.Kunststueck;
import java.util.ArrayList;

public class Hund {

    private final int gewicht;
    private String fellfarbe;
    private String name;
    private String rasse;
    private int saettigung;

    private final ArrayList<Kunststueck> tricks = new ArrayList();

    public Hund (int gewicht)
    { // der Konstruktor
        this.gewicht = gewicht;
        this.saettigung = 6;
        this.fellfarbe = "unbekannt";
        this.rasse = "unbekannt";
        this.name = "Hund";
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
    
    public void fuettern(int food) {
        saettigung += food;
    }

    @Override
    public String toString ()
    {
        StringBuilder description = new StringBuilder(10);
        
        description.append("Hund ")
                .append(name)
                .append(" ist ein ")
                .append(rasse)
                .append("\nSein Fell ist ")
                .append(fellfarbe)
                .append(" und er wiegt ")
                .append(gewicht)
                .append(" kg");
        
        return description.toString();
    }

    public void uebeKunststueck (Kunststueck trick)
    {
        tricks.add(trick);
    }
   
    public String getKunststuecke() {
        StringBuilder trickList = new StringBuilder(tricks.size());
        
        // Das ist ein Functional (auch Lambda Funktion genannt). 
        // Ein cooles neues Feature in Java 8!
        tricks.forEach((trick) -> {
            trickList.append(trick.getName()).append("\n");
        });
        return trickList.toString();
    }
    
    /**
     * Der Hund macht eime bestimmte Anzahl Kunststuecke. Er wählt diese 
     * zufaellig aus den gelernten Tricks aus.
     * Jedes Kunststueck kostet einen Saettigungspunkt. Wenn alle Punkte
     * aufgebraucht sind hat der Hund Hunger und die Methode wirft eine 
     * Exception.
     * @param number Anzahl der zu machenden Kunststuecke
     * @throws ch.abbts.nds.swe.exceptions.HungerException
     */
    public void macheKunststuecke (int number) throws HungerException
    {
        int range = tricks.size();
        for( int i = 0; i < number; i++ ){
            int trickNr = (int) (Math.random() * range);
            System.out.println(tricks.get(trickNr).machKunststück());
            --saettigung;
            if (saettigung <= 0) {
                throw (new HungerException());
            }
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
