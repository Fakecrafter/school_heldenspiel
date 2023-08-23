
/**
 * Beschreiben Sie hier die Klasse Waffe.
 * 
 * @author (KEH) 
 * @version (17.08.2023)
 */
public class Axt extends Waffe
{

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Axt()
    {
        super();
        Wuerfel w = new Wuerfel(10);
        w.werfen();
        schadensbonus = 5+w.gibAugenzahl();
    }

}
