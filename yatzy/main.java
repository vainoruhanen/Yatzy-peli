import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Peli peli = new Peli();
        Scanner lukija = new Scanner(System.in);
        peli.lisaaNopat();
        
        System.out.println("Montako pelaaja lisätään?");
        int pelaajia = Integer.valueOf(lukija.nextLine());

        for(int i = 0;i < pelaajia;i++) {
            peli.lisaaPelaaja(i+1);
        }

        int vuoro = 1;
        while(true) {

            System.out.println("\n\npelaajan " + vuoro + " vuoro.");
            System.out.println("\nKomennot: \n 1 - Heita noppaa\n 2 - Lopeta peli\n");
            int komento = Integer.valueOf(lukija.nextLine());
            if (komento == 2) {
                System.out.println(peli.kukaVoitti());
                break;
            } else if (komento == 1) {
                //eka nopanheitto
                System.out.println("\n--------------");
                peli.heitaNoppa();
                System.out.println("\n--------------\n");
                
            } else {
                System.out.println("Ei ole kelvollinen komento kirjoita 1 tai 2");
            } 
            // mitä pelaaja haluaa tehdä nyt

            while (true) {
                System.out.println("\n 1 - Heitetäänkö noppia uudestaan?");
                System.out.println(" 2 - Lisätaanko tauluun?\n 3 - Näytä pisteet");
                komento = Integer.valueOf(lukija.nextLine());
                

                if (komento == 1) {
                    //heittää tietyt nopat ja listaa ne
                    heitanoppaa(komento, peli, lukija);
                } else if (komento == 2) {
                    lisaaTauluun(lukija, peli, vuoro);
                    break;
                } else if (komento == 3) {
                    peli.getScores();
                } else {
                    System.out.println("Väärä komento");
                }
            }
            
            // if (yatzi taulu on täynnä) {
            //    Syste.out.print("Voittaja on " + peli.kukaVoitti());
            //    break; 
            // }

            // seuraavan pelaajan vuoro
            if (vuoro+1 == peli.pelaajienMaara()) {
                vuoro = 1;
            } else {
                vuoro++;
            }
        }
    }

    public static void heitanoppaa(int komento, Peli peli, Scanner lukija) {
        System.out.println("Mitkä nopat heitetään 1-5 (erottele välilyönillä)");
        String heitettavatNopat = lukija.nextLine();
        String[] numerot = heitettavatNopat.split(" ");

        for (int i = 0; i < numerot.length;i++) {
            peli.heitaNoppa(Integer.valueOf(numerot[i]));
        }

        System.out.println("\n--------------");
        peli.listaaNopat();
        System.out.println("\n--------------\n");
    }
    public static void lisaaTauluun(Scanner lukija, Peli peli, int vuoro) {
        System.out.println("\nMihin kohtaan lisätään?\n 1 - ykköset" + 
        "\n 2 - kakkoset \n 3 - kolmoset\n 4 - neloset \n 5 - viitoset " +
        "\n 6 - kuutoset \n 7 - pari\n 8 - kaksi paria\n 9 - kolme samaa" + 
        "\n 10 - neljä samaa\n 11 - pikku suora\n 12 - iso suora" + 
        "\n 13 - täyskäsi\n 14 - sattuma\n 15 - yatzy");
        int komento = Integer.valueOf(lukija.nextLine());
        if (komento <= 6) {
            peli.lisaaSummaTauluun(komento, vuoro-1);
        } else if (komento >= 11 && komento <= 15 && komento != 13) {
            peli.lisaaSummaTauluun(komento, vuoro-1);
        } else if (komento == 7 | komento == 9 | komento == 10) {
            System.out.println("Mistä numeroista saa parin, kolme samaa tai neljä samaa");
            int luku = Integer.valueOf(lukija.nextLine());
            peli.lisaaSummaTauluun(komento, luku, vuoro-1);
        }  else if (komento == 8 | komento == 13) {
            System.out.println("Mistä numeroista saa kaksi paria tai suoran (erottele välilyönillä)");
            String[] luvut = lukija.nextLine().split(" ");
            peli.lisaaSummaTauluun(komento, Integer.valueOf(luvut[0]),Integer.valueOf(luvut[1]), vuoro-1);
        }
    }
}