import java.util.Random;

public class Nopat {
private int luku;

    public Nopat() {
        luku = 0;
    }

    public int heita() {
        Random random = new Random();
        luku = random.nextInt(6) + 1;

        return luku;
    }

    public int getArvo(){
        return luku;
    }
}
