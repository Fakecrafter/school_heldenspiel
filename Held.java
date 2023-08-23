// Held ist eine Spielfigur
public class Held extends Spielfigur
{
    private String name;

    // jeder Held besitzt eine Waffe die getauscht werden kann
    private Waffe meineWaffe;

    public Held(String pName)
    {
        super();
        name = pName;
        if(meinWuerfel.werfen() % 2 == 0)
        {
            meineWaffe = new Axt();
        }
        else
        {
            meineWaffe = new Schwert();
        }
    }

    // Angriffswert bestehend aus eigener Staerke und Waffenschaden
    public double getAngriffswert()
    {
        return staerke + meineWaffe.getSchadensbonus();
    }

    // Waffe austauschen
    public void waffeAufheben(Waffe pWaffe)
    {
        meineWaffe = pWaffe;
    }
}
