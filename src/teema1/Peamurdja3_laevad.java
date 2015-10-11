package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {

    // 1 0 1 0 1 0 1 0
    // Näiteks 10 reas ja 3 laeva, või mis iganes sisendiks tuleb
    // Arrayd?
    //VÕtame sisendi kasutajalt 0-10 näiteks ja kontrollime kas seal oli laev või ei.
    public static void main(String[] args) {

        ArrayList<Integer> ruudustik = saaRuudustik(8);
        System.out.println(ruudustik);

        do {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta laeva kordinaadid");
        int sisend = sc.nextInt();

            if (ruudustik.get(sisend) == 1) {
                System.out.println("Pihtas, põhjas");
                ruudustik.set(sisend, 2);
            } else if (ruudustik.get(sisend) == 2) {
                System.out.println("Juba tulistasid");
            } else if (ruudustik.get(sisend) == 0) {
                System.out.println("Mööda");
                ruudustik.set(ruudustik.get(sisend), 3);
            } else if (ruudustik.get(sisend) == 3) {
                System.out.println("Juba tulistasid");
            }
        } while (ruudustik.contains(1));

        System.out.println("Mäng läbi!");

    }

    public static int saaInt() {

        int a;

        Random rndRuut = new Random();

        if (rndRuut.nextBoolean()) {
            return 1;
        } else {
            return 0;
        }

    }

    public static ArrayList saaRuudustik(int suurus) {

        ArrayList<Integer> ruudustik = new ArrayList();
        for (int i = 0; i<suurus; i++) {
            ruudustik.add(saaInt());
        }

        return ruudustik;

    }


}
