public class Held extends Spielfigur
{
    // Attribute
    private String name;

    // Bezugsobjekte
    private Waffe meineWaffe;

    public Held(String pName)
    {
        super();
        name = pName;
        meinWuerfel.werfen();
        if(meinWuerfel.gibAugenzahl() % 2 == 0)
        {
            meineWaffe = new Axt();
        }
        else
        {
            meineWaffe = new Schwert();
        }
    }

    public double getAngriffswert()
    {
        return staerke + meineWaffe.getSchadensbonus();
    }

    public void waffeAufheben(Waffe pWaffe)
    {
        meineWaffe = pWaffe;
    }


}
