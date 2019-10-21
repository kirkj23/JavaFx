import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;
import javafx.animation.AnimationTimer;

public class Truck extends Application {
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

                gc.setFill(Color.BLACK);
                gc.fillRect(200+x, 200, 300, 125);

                gc.setFill(Color.BLUE);
                gc.fillRect(425+x, 230, 75, 50);


                gc.setFill(Color.RED);
                gc.fillOval(220+x, 300, 60, 60);


                gc.setFill(Color.RED);
                gc.fillOval(420+x, 300, 60, 60);

                gc.setFill(Color.DEEPSKYBLUE);
                gc.fillRect(0+x, 0, 700, 400);

                gc.setFill(Color.BLACK);
                gc.fillRect(200+x, 200, 300, 125);

                gc.setFill(Color.BLUE);
                gc.fillRect(425+x, 230, 75, 50);


                gc.setFill(Color.RED);
                gc.fillOval(220+ x, 300, 60, 60);


                gc.setFill(Color.RED);
                gc.fillOval(420 + x, 300, 60, 60);

                x += 3;


            }


        };
        timer.start();
    }
    public static void main(String[] args) {
        launch(args);
    }
}