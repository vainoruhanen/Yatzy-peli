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

        while(true) {
            int vuoro = 1;

            System.out.println("pelaajan " + vuoro + " vuoro.");
            System.out.println("Komennot:\n \n 1 - Heita noppaa\n 2 - Lopeta peli");
            int komento = Integer.valueOf(lukija.nextLine());
            if (komento == 2) {
                System.out.println("Voittaja on " + peli.kukaVoitti());
                break;
            } else if (komento == 1) {
                //nopan heitto
            } else {
                System.out.println("Ei ole kelvollinen komento kirjoita 1 tai 2");
            } 
            // mitkä luvut nopassa on
            // mitä pelaaja haluaa tehdä nyt

            // if (yatzi taulu on täynnä) {
            //    Syste.out.print("Voittaja on " + peli.kukaVoitti());
            //    break; 
            // }

            // seuraavan pelaajan vuoro
            if (vuoro == peli.pelaajienMaara()) {
                vuoro = 1;
            } else {
                vuoro++;
            }
        }
    }
}