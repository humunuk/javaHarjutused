package OOP_Pohimotted;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by skallari on 21.11.15.
 * * Laev
 *     Teab oma kordinaate
 *     Teab kas ta on elus (pihta saanud)
 *     Oskab pihta saada
 *     Oskab ennast näidata, kui on pihta saanud
 *     Oskab sõita õigesse kohta
 *     Oskab teise laeva põrkumist kontrollida (täna me ei kontrolli seda)
 *     Oskab öelda, kas ta on veel elus
 *
 */
public class Laev {

    private int[] koordinaadid;
    private boolean elus = true;

    public Laev(int mereServaPikkus) {
        System.out.println("LOO LAEV");
        genereeriKoordinaadid(mereServaPikkus);
    }

    private void genereeriKoordinaadid(int mereServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(mereServaPikkus);
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[]{x, y};
    }

    public boolean kasOledElus() {
        return elus;
    }

    public boolean kasSaadPihta(int[] lask) {
        if (Arrays.equals(koordinaadid, lask) && elus) {
            elus = false;
            return true;
        }
        return false;
    }

    public int[] annaAsukohta() {
        return koordinaadid;
    }
}
