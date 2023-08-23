public abstract class Spielfigur
{
    protected double staerke;
    protected int lebenspunkte;

    protected Wuerfel meinWuerfel;

    public Spielfigur()
    {
	// zufaellige Zahlen generieren
        meinWuerfel = new Wuerfel(50);
	// Wuerfel Methoden muessen noch verbessert werden
        staerke = meinWuerfel.werfen();
        lebenspunkte = 5;
    }

    public int getLebenspunkte()
    {
        return lebenspunkte;
    }

    // diese Methode muss fuer jede Spielfigur vorhanden sein
    public abstract double getAngriffswert();

    public void zieheLebenspunktAb()
    {
         lebenspunkte = lebenspunkte -1;
    }



}
