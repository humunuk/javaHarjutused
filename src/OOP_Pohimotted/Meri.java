package OOP_Pohimotted;

import java.util.Arrays;

/**
 * Created by skallari on 21.11.15.
 */
public class Meri {

    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus) {
        System.out.println("START MERI");
        mereServaPikkus = pikkus;
        looLaevastik();
    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);
        }
    }

    public boolean kasOnLaevuElus() {
        for (Laev laev : laevastik) {
            boolean elus = laev.kasOledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasSaadPihta(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaSeis() {
        int[][] laud = new int[mereServaPikkus][mereServaPikkus];
        for (Laev laev : laevastik) {
            int [] k = laev.annaAsukohta();
            boolean elus = laev.kasOledElus();
            if (!elus) {
                laud[k[1]][k[0]] = 2;
            }
        }
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
    }
}
