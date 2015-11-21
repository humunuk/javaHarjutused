package OOP_Pohimotted;

/**
 * Created by skallari on 21.11.15.
 */
public class Main {
    public static void main(String[] args) {
        new Mang();
    }
}

/*
* Klassid, klassidel on 2 asja, ta hoiab mingit infot või/ja ta oskab midagi teha.
* Main
*     Oskab mängu käivitada
* Mäng
*     Oskab mängu seadistada
*     Oskab mängu töös hoida
*     Oskab mängu lõpetada
* Mängija
*     Oskab küsida lasu kordinaate
*     Oskab tagasisidet anda kui lask läks pihta
*     Oskab tagasisidet anda kui lask läks mööda
*     Oskab tagasisidet anda kui mäng on läbi
* Meri - Suhtleb laevaga
*     Teab laevu
*     Oskab laevastiku luua
*     Oskab registreerida, kas laev sai pihta
*     Oskab kontrollida, kas laevu on veel merel (Oskab otsustada, millal mäng on läbi)
*     Oskab kuvada mängu seisu näidata (prindib välja laevastiku [gridi])
* Laev
*     Teab oma kordinaate
*     Teab kas ta on elus (pihta saanud)
*     Oskab pihta saada
*     Oskab ennast näidata, kui on pihta saanud
*     Oskab sõita õigesse kohta
*     Oskab teise laeva põrkumist kontrollida (täna me ei kontrolli seda)
*     Oskab öelda, kas ta on veel elus
 */