
/**
 * Beschreiben Sie hier die Klasse Waffe.
 *
 * @author (KEH)
 * @version (17.08.2023)
 */
public class Schwert extends Waffe
{

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Schwert ()
    {
        super();
        Wuerfel w = new Wuerfel(30);
        schadensbonus = 15+w.gibAugenzahl();
    }

}
