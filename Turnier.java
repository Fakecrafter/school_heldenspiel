import java.util.Random;
public class Turnier {
    private Monster monster;
    private Held[] helden;

    public Game() {
        Held[] helden = new Held[10];
        for(int i=0;i <= 10; i++) {
            helden[i] = new Held("Superheld" + Integer.toString(i));
        }
    }
    public static void main(String[] args) {
    }
    public void fight(Held held) {
        if(monster.getAngriffswert() > held.getAngriffswert()) {
            held.verliereLeben();
        }
        else if (monster.getAngriffswert() < held.getAngriffswert()) {
            monster.verliereLeben();
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
         int tempVergleich = 0;
         int heldenNummer;
         for(int i=0;i<helden.length;i++) {
             if(helden[i].getAngriffswert() > tempVergleich) {
                 tempVergleich = helden[i].getAngriffswert();
                 heldenNummer = i;
             }
         }
         return helden[heldenNummer];
    }
    public Held getSchwaechsterHeld() {
         int tempVergleich = 0;
         int heldenNummer;
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
    }
    public void sortiereHelden() {}
}
