package OOP_Pohimotted;

/**
 * Created by skallari on 21.11.15.
 * * Mäng
 *     Oskab mängu seadistada
 *       - Mere ja laevastiku genereerimine.
 *     Oskab mängu töös hoida
 *       - Kuni laevu on elus, küsi mängijalt koordinaate
 *       - Pommita merd
 *       - Anna tagasisidet
 *     Oskab mängu lõpetada
 *       - Kui on läbi, siis on läbi, tee mida iganes
 */
public class Mang {

    public Mang() {
        System.out.println("START MÄNG");
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()) {
            meri.kuvaSeis();
            //Ask user input
            int[] lask = mangija.annabLasuKoordinaadid();
            boolean vastus = meri.kasKeegiSaiPihta(lask);
            if (vastus) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }

        mangija.gameOver();
    }

}