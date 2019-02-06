package ch.abbts.nds.swe.tricks;

/**
 * Bringt dem Hund das Kunststueck 'Bring' (Apportieren) bei.
 * 
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class Bring extends Kunststueck {

    public Bring(String name) {
        super(name);
    }

    @Override
    public String machKunststück() {
        return "Ich mache " + name;
    }
    
}
