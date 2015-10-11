package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

public class jormaFoor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Foor foor = new Foor(Foor.ALUMINE, primaryStage);

        punaneKestab(foor);
        punaneRoheliseks(foor);
        rohelineKestab(foor);
        rohelinePunaseks(foor);

    }

    // 7s
    public static void rohelineKestab(Foor foor){
        foor.syytaRoheline();
        foor.paus(7.0);
    }

    // 4s
    public static void rohelinePunaseks(Foor foor) {
        foor.syytaRoheline();

        // blink 6x => 3s
        // off on off on off on
        for (int i = 0; i < 6; i++) {
            foor.vahetaRohelist();
            foor.paus(0.5);
        }
        foor.kustutaRoheline();

        foor.syytaKollane();
        foor.paus(1.0);
        foor.kustutaKollane();
    }

    // 10s
    public static void punaneKestab(Foor foor){
        foor.syytaPunane();
        foor.paus(10.0);
    }

    // 1s
    public static void punaneRoheliseks(Foor foor) {
        foor.syytaPunane();
        foor.syytaKollane();
        foor.paus(1.0);

        foor.kustutaPunane();
        foor.kustutaKollane();
    }
}