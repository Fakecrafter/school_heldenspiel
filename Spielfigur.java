 
/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author (KEH) 
 * @version (17.08.2023)
*/
public abstract class Spielfigur
{
    // Attribute
    protected double staerke;
    protected int lebenspunkte;
    
    // Bezugsobjekte
    protected Wuerfel meinWuerfel;

    /**
     * Konstruktor für Objekte der Klasse Held
     */
    public Spielfigur()
    {
        meinWuerfel = new Wuerfel(50);
        meinWuerfel.werfen();
        staerke = meinWuerfel.gibAugenzahl();    
        lebenspunkte = 5;       
    }
    
    public int getLebenspunkte()
    {
        return lebenspunkte;
    }
    
    public abstract double getAngriffswert();
      
    public void zieheLebenspunktAb()
    {
         lebenspunkte = lebenspunkte -1;
    }
  

   
}
