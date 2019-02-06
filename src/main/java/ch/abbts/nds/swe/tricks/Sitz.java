package ch.abbts.nds.swe.tricks;

/**
 * Bringt dem Hund das Kunststueck 'Sitz' bei.
 * 
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class Sitz extends Kunststueck {

    public Sitz(String name) {
        super(name);
    }

    @Override
    public String machKunststück() {
        return "Wuff, ich mache " + name;
    }    
}
