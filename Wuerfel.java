/**
 * Wuerfel 
 * 
 * @author GK EF (Abi 2025)
 * @version 15.08.2023
 */

public class Wuerfel
{

    // Attribute der Klasse Wuerfel
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
        werfen();
    }

    // Anfang Methoden
    /**
     * Der Wuerfel wird einmal geworfen und seine 
     * Augenzahl damit geaendert
     */
    public void werfen() {
        // ermittle eine Zufallszahl zwischen 1 und der Seitenzahl 
        // und setze diese in das Attribut augenzahl
        //
        // Die Methode random aus der Klasse Math        
        // erzeugt eine Zufallszahl
        // zwischen 0 und 1 (rationale Zahl)
        augenzahl =  (int) ((Math.random()*seitenzahl)+1);
    }
    
    public int gibAugenzahl()
    {
        return augenzahl;
    }

}
