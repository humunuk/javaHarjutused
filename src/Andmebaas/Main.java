package Andmebaas;

import java.util.Scanner;

/**
 * Created by skallari on 22.11.15.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Sisesta kasutajanimi: ");
        String kasutajanimi = sc.nextLine();
        System.out.println("Sisesta parool");
        String parool = sc.nextLine();

        Database andmebaas = new Database();
        andmebaas.looTabel();
        boolean kasutajaEksisteerib = andmebaas.kasKasutajaOlemas(kasutajanimi);
        System.out.println("Kas kasutaja eksisteerib: " + kasutajaEksisteerib);

        if (kasutajaEksisteerib) {
            System.out.println("Oled sisse logitud, programm väljub");
        } else {
            andmebaas.registreeri(kasutajanimi, parool);
        }
        andmebaas.sulgeYhendus();
    }

}
