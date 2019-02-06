package ch.abbts.nds.swe.tricks;

/**
 * Abstrakte Klasse als Vorlage fuer ein Kunststueck.
 * 
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public abstract class Kunststueck {
    String name;

    public Kunststueck(String name) {
        this.name = name;
    }
    
    public abstract String machKunststück();
}
