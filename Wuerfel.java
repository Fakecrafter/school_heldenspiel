public class Wuerfel
{

    private int augenzahl;
    private int seitenzahl;

    /**
     * Konstruktor fuer Objekte der Klasse TWuerfel
     */
    public Wuerfel(int pSeitenzahl)
    {
        // Ein Wuerfel muss mindestens 2 Seiten besietzen
        if(pSeitenzahl < 2) pSeitenzahl = 2;
        seitenzahl = pSeitenzahl;
	augenzahl = 0;
        werfen();
    }
    public int werfen() {
	// Math.random() generiert Zahl zwischen 0 und 1
	// auf gewuenschte Range skalieren (indem man mit seitenzahl multipliziert)
        augenzahl =  (int) ((Math.random()*seitenzahl)+1);
	return augenzahl;
    }

    public int gibAugenzahl() {
	return augenzahl;
    }
}
