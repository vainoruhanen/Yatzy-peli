import java.util.ArrayList;

public class Peli {
    private ArrayList<Pelaaja> pelaajat;
    private ArrayList<Nopat> nopat;
    private Laskuri laskuri;

    public Peli() {
        this.laskuri = new Laskuri();
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

    public void listaaNopat() {
        for (int i = 0;i < 5;i++) {
            System.out.print(nopat.get(i).getArvo() + ", ");
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
            System.out.print(nopat.get(i).getArvo() + ", ");
        }
    }

    public void heitaNoppa(int noppa) {
        this.nopat.get(noppa-1).heita();
    }

    public void getScores() {
        for (int i = 0;i < pelaajat.size();i++) {
            System.out.println("Pelaaja: " + pelaajat.get(i).getNimi() + " Pisteet: " + pelaajat.get(i).getPisteet());
        }
    }

    public String kukaVoitti() {
        System.out.println("\n\n\n");    
        getScores();
        Pelaaja vara = new Pelaaja(99);
        for (int i=0;i < pelaajat.size()-1;i++) {
            if (pelaajat.get(i).getPisteet() > vara.getPisteet()) {
                vara = pelaajat.get(i);
            }
        }
        return "\nVoittaja on pelaaja " + vara.getNimi();
    }
    public int pelaajienMaara() {
        return this.pelaajat.size()+1;
    }

    public void lisaaSummaTauluun(int komento, int pelaaja) {
        if (komento == 1 ) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 1));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 1) + " pistettä!\n");
        } else if (komento == 2) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 2));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 2) + " pistettä!\n");
        } else if (komento == 3) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 3));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 3) + " pistettä!\n");
        } else if (komento == 4) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 4));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 4) + " pistettä!\n");
        } else if (komento == 5) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 5));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 5) + " pistettä!\n");
        } else if (komento == 6) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.samaaNumeroa(nopat, 6));
            System.out.println("\nsinä sait " + this.laskuri.samaaNumeroa(nopat, 6) + " pistettä!\n");
        } else if (komento == 11) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.suora(nopat));
            System.out.println("\nsinä sait " + this.laskuri.suora(nopat) + " pistettä!\n");
        } else if (komento == 12) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.suora(nopat));
            System.out.println("\nsinä sait " + this.laskuri.suora(nopat) + " pistettä!\n");
        } else if (komento == 14) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.sattuma(nopat));
            System.out.println("\nsinä sait " + this.laskuri.sattuma(nopat) + " pistettä!\n");
        } else if (komento == 15) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.yatzy(nopat));
            System.out.println("\nsinä sait " + this.laskuri.yatzy(nopat) + " pistettä!\n");
        } 
    }
    public void lisaaSummaTauluun(int komento, int luku, int pelaaja) {
        if (komento == 7) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.yksiPari(nopat, luku));
            System.out.println("\nsinä sait " + this.laskuri.yksiPari(nopat, luku) + " pistettä!\n");
        } else if (komento == 9) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.kolmeSamaa(nopat, luku));
            System.out.println("\nsinä sait " + this.laskuri.kolmeSamaa(nopat, luku) + " pistettä!\n");
        } else if (komento == 10) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.neljaSamaa(nopat, luku));
            System.out.println("\nsinä sait " + this.laskuri.neljaSamaa(nopat, luku) + " pistettä!\n");
        }
    }
    public void lisaaSummaTauluun(int komento, int luku, int luku2, int pelaaja) {
        if (komento == 8) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.kaksiParia(nopat, luku, luku2));
            System.out.println("\nsinä sait " + this.laskuri.kaksiParia(nopat, luku, luku2) + " pistettä!\n");
        } else if (komento == 13) {
            pelaajat.get(pelaaja).addPisteet(this.laskuri.taysKasi(nopat, luku, luku2));
            System.out.println("\nsinä sait " + this.laskuri.taysKasi(nopat, luku, luku2) + " pistettä!\n");
        }
    }
}
