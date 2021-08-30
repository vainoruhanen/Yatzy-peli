
public class Pelaaja {

    private int nimi;
    private int valiPisteet;
    private int pisteet;
    private boolean bonusSaatu;


    public Pelaaja(int nimi) {
        this.nimi = nimi;
        this.valiPisteet = 0;
        this.pisteet = 0;
        this.bonusSaatu = false;
    }

    public int getPisteet() {
        return this.pisteet;
    } 

    public int getNimi() {
        return this.nimi;
    }

    public int getValipisteet() {
        return this.valiPisteet;
    }

    public boolean getBonussaatu() {
        return this.bonusSaatu;
    }

    public void setBonussaatu() {
        this.bonusSaatu = true;
        this.pisteet += 50;
    }

    public void addValipisteet(int pisteet) {
        this.valiPisteet += pisteet;
    }
    
    public void addPisteet(int pisteet) {
        this.pisteet += pisteet;
    }
}
