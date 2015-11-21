package OOP_Pohimotted;

import java.util.Scanner;

/**
 * Created by skallari on 21.11.15.
 */
public class Mangija {

    private Scanner sc = new Scanner(System.in);

    public int[] annabLasuKoordinaadid() {
        System.out.println("Palun sisesta lasu koordinaadid formaadis xxx-yyy");
        String[] sisestus = sc.nextLine().split("-");
        int x = Integer.parseInt(sisestus[0]);
        int y = Integer.parseInt(sisestus[1]);
        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("Said pihta! :-)");
    }

    public void moodas() {
        System.out.println("Läks mööda! :-(");
    }

    public void gameOver() {
        System.out.println("Mäng läbi! Täname külastamast! :-)");
        System.exit(0);
    }
}
