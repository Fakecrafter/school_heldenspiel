public class Turnier {
    private Monster monster;
    private Held[] helden;

    // Konstruktor
    public Turnier() {
        Held[] helden = new Held[10];
        for(int i=0;i < 10; i++) {
            // Helden initialisieren und Namen vergeben
            helden[i] = new Held("Superheld" + Integer.toString(i));
	    System.out.println(helden[i].getName());
        }
    }
    public void fight(Held held) {
        // ueberpruefen wer mehr Angriffsschaden verursacht
        if(monster.getAngriffswert() > held.getAngriffswert()) {
            held.zieheLebenspunktAb();
        }
        else if (monster.getAngriffswert() < held.getAngriffswert()) {
            monster.zieheLebenspunktAb();
        }
        // ueberpruefen ob irgendwer tot ist
        if(held.getLebenspunkte() <= 0) {
            System.out.println("Held hat verloren");
        }
        if(monster.getLebenspunkte() <= 0) {
            System.out.println("Monster hat verloren");
        }
    }
    public int getHeldenGesamtAngriffswert() {
        int result = 0;
        for(int i=0;i<helden.length;i++) {
            result += helden[i].getAngriffswert();
        }
        return result;
    }
    public Held getStaerksterHeld() {
         double tempVergleich = 0;
         int heldenNummer = 0;
         for(int i=0;i<helden.length;i++) {
             if(helden[i].getAngriffswert() > tempVergleich) {
                 tempVergleich = helden[i].getAngriffswert();
                 heldenNummer = i;
             }
         }
         return helden[heldenNummer];
    }
    public Held getSchwaechsterHeld() {
         double tempVergleich = 0;
         int heldenNummer = 0;
         for(int i=0;i<helden.length;i++) {
             if(helden[i].getAngriffswert() < tempVergleich) {
                 tempVergleich = helden[i].getAngriffswert();
                 heldenNummer = i;
             }
         }
         return helden[heldenNummer];
    }
    public float getAverageLebenspunkte() {
        int temp = 0;
        for(int i=0;i<helden.length;i++) {
            temp += helden[i].getLebenspunkte();
        }
        return temp / helden.length;
    }
    public Held getHeldMehrLebenAls(int lebensGrenze) {
        for(int i=0;i<helden.length;i++) {
            if(helden[i].getLebenspunkte() > lebensGrenze) {
                return helden[i];
            }
        }
        // falls kein Held die LebensGrenze uebertritt gebe null zurueck
        return null;
    }
	// Todo
    public void sortiereHeldenBubble() {
		for(int i = 0; i < helden.length; i++) {
			int extraAlreadySortedNums = 0;
	    	for(int j = 0; j < helden.length - (1 + alreadySorted); j++) {
	    		if(helden[j].getAngriffswert() > helden[j+1].getAngriffswert()) {
					Held temp = helden[j];
                	helden[j] = helden[j+1];
                	helden[j+1] = temp;
				} else {
					extraAlreadySortedNums++;
				}
			}
		}
    }
    public void sortiereHelden() {
        for(int i = 0; i < helden.length - 1; i++) {
            int weakestHeroIndex = i;
            for(int j = i + 1; j < helden.length; j++) {
				// suche schwaechsten Helden
                if(helden[weakestHeroIndex].getAngriffswert() > helden[j].getAngriffswert()) {
                    weakestHeroIndex = j;
                }
            }
            // wenn erstes element gleichzeitig schwaechstes ist, kein Grund zu tauschen
            if(weakestHeroIndex != i) {
				// ersten Helden mit schwaechstem Helden tauschen
				Held temp = helden[i];
                helden[i] = helden[weakestHeroIndex];
                helden[weakestHeroIndex] = temp;
            }
        }
    }
}
