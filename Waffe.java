
/**
 * Beschreiben Sie hier die Klasse Waffe.
 *
 * @author (KEH)
 * @version (17.08.2023)
 */
public abstract class Waffe
{
    // Attribute
    protected double schadensbonus;

    /**
     * Konstruktor für Objekte der Klasse Waffe
     */
    public Waffe()
    {
        Wuerfel meinWuerfel = new Wuerfel(10);
        schadensbonus = meinWuerfel.werfen();
    }


    public double getSchadensbonus()
    {
        return schadensbonus;
    }
}
