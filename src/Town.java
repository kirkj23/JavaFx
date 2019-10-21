import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;
import javafx.animation.AnimationTimer;

public class Town extends Application {
    @Override
    public void start(Stage stage) {

        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
                stage, "Shell Graphics Application", 700, 400);
        AnimationTimer timer = new AnimationTimer() {
            double x = 0;

            @Override
            public void handle(long now) {
                gc.setFill(Color.DEEPSKYBLUE);
                gc.fillRect(0, 0, 700, 400);

                gc.setFill(Color.GREY);
                gc.fillRect(0, 0, 100, 300);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(10, 40, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(55, 40, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(10, 100, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(55, 100, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(10, 160, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(55, 160, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(10, 220, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(55, 220, 30, 30);


                gc.setFill(Color.ROYALBLUE);
                gc.fillRect(100, 200 - x, 250, 100);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(120, 235 - x, 75, 40);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(250, 235 - x, 75, 40);

                gc.setFill(Color.BROWN);
                gc.fillRect(215, 250 - x, 20, 50);

                gc.setStroke(Color.WHITE);
                gc.strokeText("WALMART", 195, 215 - x);


                gc.setFill(Color.DARKGRAY);
                gc.fillRect(350, 180, 20, 120);

                gc.setFill(Color.DARKGRAY);
                gc.fillRect(470, 180, 20, 120);

                gc.setFill(Color.GREENYELLOW);
                gc.fillRect(370, 180, 100, 120);

                gc.setFill(Color.DARKGREY);
                gc.fillOval(350, 140, 140, 80);

                gc.setStroke(Color.GREEN);
                gc.strokeText("Town Park", 395, 180);


                gc.setFill(Color.MAROON);
                gc.fillRect(490, 0, 100, 300);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(500, 60, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(545, 60, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(500, 120, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(545, 120, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(500, 180, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(545, 180, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(500, 240, 30, 30);

                gc.setFill(Color.LIGHTBLUE);
                gc.fillRect(545, 240, 30, 30);


                gc.setFill(Color.BLACK);
                gc.fillRect(0, 300, 700, 100);

                gc.setFill(Color.YELLOW);
                gc.fillRect(-25, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(50, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(125, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(200, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(275, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(350, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(425, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(500, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(575, 350, 50, 10);

                gc.setFill(Color.YELLOW);
                gc.fillRect(650, 350, 50, 10);


                gc.setFill(Color.WHITE);
                gc.fillRect(590, 200, 200, 100);

                gc.setFill(Color.BLACK);
                gc.fillRect(650, 250, 20, 50);

                gc.setFill(Color.WHITE);
                gc.fillOval(590, 160, 140, 75);


                gc.setStroke(Color.BLACK);
                gc.strokeText("Town Hall", 630, 200);

                if (x< 200) {
                    x += .5;
                }
            }


        };
        timer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}