import java.util.ArrayList;

public class Peli {
    private ArrayList<Pelaaja> pelaajat;
    private ArrayList<Nopat> nopat;

    public Peli() {
        this.pelaajat = new ArrayList<>();
        this.nopat = new ArrayList<>();
    }

    public void lisaaPelaaja(int nimi) {
        this.pelaajat.add(new Pelaaja(nimi));
    }

    public void lisaaNopat() {
        for (int i = 0;i < 5;i++) {
            this.nopat.add(new Nopat());
        }
    }

    public void giveBonus(Pelaaja pelaaja) {
        if (pelaaja.getBonussaatu() == false && pelaaja.getValipisteet() >= 63) {
            pelaaja.setBonussaatu();
        }
    }
    
    public void heitaNoppa() {
        for (int i = 0; i < 5;i++) {
            this.nopat.get(i).heita();
        }
    }

    public void getScores() {
        for (int i = 0;i < pelaajat.size();i++) {
            System.out.println("Nimi: " + pelaajat.get(i).getNimi() + " Pisteet: " + pelaajat.get(i).getPisteet());
        }
    }

    public String kukaVoitti() {
        Pelaaja vara = new Pelaaja(0);
        getScores();
        for (int i=0;i < pelaajat.size()-1;i++) {
            if (pelaajat.get(i).getPisteet() > vara.getPisteet()) {
                vara = pelaajat.get(i);
            }
        }
        return "Voittaja on " + vara.getNimi();
    }
    public int pelaajienMaara() {
        return this.pelaajat.size();
    }
}
