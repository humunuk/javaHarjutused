package teema1;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor2 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        int count = 0;
        while (count < 10) {
            PunasestRoheliseks(foor1);
            PunasestRoheliseks(foor2);
            RohelisestPunaseks(foor3);
            RohelisestPunaseks(foor4);
            count = count + 1;
        }
    }
    public void PunasestRoheliseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(3.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.vahetaRohelist();
        foor.paus(2.0);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
    }
    public void RohelisestPunaseks(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(2.0);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(3.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaPunast();
    }
}
