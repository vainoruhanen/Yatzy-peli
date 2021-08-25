import java.util.ArrayList;
import java.util.Collections;

public class Laskuri {

    public Laskuri() {

    }

    public int samaaNumeroa(ArrayList<Nopat> nopat, int luku) { // Laskee montako kertaa parametrina annettu silmäluku
                                                                // esiintyy parametrina annetuissa nopissa ja laskee, //
                                                                // sekä palauttaa pisteet
        int lkm = 0;
        int pisteet = 0;

        for (Nopat x : nopat) {
            if (x.getArvo() == luku) {
                lkm++;
            }
        }
        pisteet = lkm * luku;
        return pisteet;

    }

    public int yksiPari(ArrayList<Nopat> nopat, int luku) { // tarkistaa löytyyky parametrina annetuista
                                                            // nopista(listasta) paria parametrina annetulle luvulle

        int lkm = 0;

        for (Nopat x : nopat) {
            if (x.getArvo() == luku) {
                lkm++;
            }
        }
        if (lkm >= 2) {
            return luku + luku;
        }
        return 0;
    }

    public int kaksiParia(ArrayList<Nopat> nopat, int luku1, int luku2) {
        int lkm1 = 0;
        int lkm2 = 0;

        if (luku1 == luku2) { // jos annetut luvut ovat samat palauttaa 0 pistettä
            return 0;
        }

        for (Nopat x : nopat) { // tarkistaa löytyykö kummaltakin luvulta paria
            if (x.getArvo() == luku1) {
                lkm1++;
            }
            if (x.getArvo() == luku2) {
                lkm2++;
            }
        }
        if (lkm1 >= 2 && lkm2 >= 2) {
            return (luku1 * 2) + (luku2 * 2); // palauttaa pisteet jos parit löytyi
        }
        return 0; // palauttaa 0 jos pareja ei ollut

    }

    public int kolmeSamaa(ArrayList<Nopat> nopat, int luku) {
        int lkm = 0;

        for (Nopat x : nopat) { // laskee montako kertaa silmäluku esintyy
            if (x.getArvo() == luku) {
                lkm++;
            }
        }

        if (lkm >= 3) { // jos silmäluku esiintyy vähintään 3 kertaa palautetaan pisteet eli silmäluku
                        // kerrottuna kolmella
            return luku * 3;
        }
        return 0;
    }

    public int neljaSamaa(ArrayList<Nopat> nopat, int luku) {
        int lkm = 0;

        for (Nopat x : nopat) { // laskee montako kertaa silmäluku esintyy
            if (x.getArvo() == luku) {
                lkm++;
            }
        }

        if (lkm >= 4) { // jos silmäluku esiintyy vähintään 4 kertaa palautetaan pisteet eli silmäluku
                        // kerrottuna neljällä
            return luku * 4;
        }
        return 0;
    }

    public int suora(ArrayList<Nopat> nopat) {
        ArrayList<Integer> lista = new ArrayList<>();
        boolean onPieniSuora = false;
        boolean onIsoSuora = false;

        for (Nopat x : nopat) {
            lista.add(x.getArvo());         //käy läpi nopat ja tekee silmäluvuista integer tyyppisen listan
        }

        Collections.sort(lista);            //järjestelee listan pienimmästä suurimpaan

        int i = 1;
        for (int x : lista) {       //käy listan läpi ja laskee onko suoraa 1-5 vai ei

            if (x == i) {
                onPieniSuora = true;
            }

            if (x != i) {
                onPieniSuora = false;
                break;
            }
            i++;
        }

        if (onPieniSuora == true) {     //jos on pieni suora niin palauttaa 15 pistettä
            return 15;
        }

        i = 2;
        for (int x : lista) {         //käy listan läpi ja laskee onko suoraa 2-6 vai ei

            if (x == i) {
                onIsoSuora = true;
            }

            if (x != i) {
                onIsoSuora = false;
                break;
            }
            i++;
        }

        if (onIsoSuora == true) {       //jos on iso suora niin palauttaa 20 pistettä
            return 20;
        }

        return 0;

    }

    public int taysKasi(ArrayList<Nopat> nopat, int ensimmainen, int toinen) {
        
        int eka = 0;  
        int toka = 0; 

        for (Nopat x : nopat) {              //käy läpi nopat, ja tarkistaa onko täyskäsi
            if(x.getArvo() == ensimmainen){
                eka++;
            }           
            if(x.getArvo() == toinen){
                toka++;
            }          
        }

        if(eka == 3 && toka == 2){   // laskee täyskäden pisteet
            return (ensimmainen * 3) + (toinen * 2);
        }
        if(toka == 3 && eka == 2){
            return (toinen * 3) + (ensimmainen * 2);
        }
        
        return 0; //jos täyskättä ei ole palauttaa 0 pistettä.
    }

    public int yatzy(ArrayList<Nopat> nopat) {
        int yksi = 0;
        int kaksi = 0;
        int kolme = 0;
        int nelja = 0;
        int viisi = 0;
        int kuusi = 0;

        for(Nopat x : nopat){                   //katsoo onko viisi samaa
            
            if(x.getArvo() == 1){
                yksi++;
            }

            if(x.getArvo() == 2){
                kaksi++;
            }

            if(x.getArvo() == 3){
                kolme++;
            }

            if(x.getArvo() == 4){
                nelja++;
            }

            if(x.getArvo() == 5){
                viisi++;
            }

            if(x.getArvo() == 6){
                kuusi++;
            }
        }

        if(yksi == 5 || kaksi == 5 || kolme == 5 || nelja == 5 || viisi == 5 || kuusi == 5){    //jos on 5 samaa, palauttaa 50 pistettä
            return 50;
        }
  
        return 0; //jos viittä samaa ei ole, palauttaa nolla
    }

    public int sattuma(ArrayList<Nopat> nopat) {
        int summa = 0;

        for(Nopat x : nopat){           //laskee noppien summan
            summa += x.getArvo();
        }
        return summa;
    }
}
