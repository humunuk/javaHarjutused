package teema2;

/**
 * Created by skallari on 1.11.15.
 */

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Peamurdjal_laevad_fx extends Application {

    Stage lava;
    GridPane laud;
    StackPane maailm;
    int laevaServaPikkus = 150;
    int lauaServaPikkus = 4;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);

    @Override
    public void start(Stage primaryStage) throws Exception {

        lava = primaryStage;

        seadistaLava();
        genereeriGrid();
        reageeriKlikile();
        //kasOnLaevasidAlles();
        //gameOver();

    }

    private void reageeriKlikile() {

        laud.setOnMouseClicked(event -> {
            Rectangle shape = (Rectangle) event.getTarget();
            String id = shape.getId();

            if (id == "laev") {
                shape.setId("pihtas");
                shape.setFill(laevaMuster); // Ei tööta
            } else if (id == "tühi") {
                shape.setId("meri");
                shape.setFill(Color.DARKBLUE);
            }

        });

    }

    private void genereeriGrid() {

        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {
                Rectangle ruut = new Rectangle(laevaServaPikkus, laevaServaPikkus);
                int rand = (int) (Math.random() * 2);
                if (rand == 1) {
                    ruut.setId("meri");
                } else {
                    ruut.setId("laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add(ruut, i, j);
            }
        }

    }

    private void seadistaLava() {

        laud = new GridPane();
        Scene manguStseen = new Scene(laud, 600, 600);
        lava.setScene(manguStseen);
        lava.show();
        lava.setOnCloseRequest(event -> { System.exit(0); });

    }




}
