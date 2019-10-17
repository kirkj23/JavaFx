import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;

public class Truck extends Application{
    @Override
    public void start( Stage stage) throws Exception{
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
                stage, "Shell Graphics Application", 700, 400);

        Random randy = new Random();
        int red = randy.nextInt(0xFF);
        int blue = randy.nextInt(0xFF);
        int green = randy.nextInt(0xFF);

        gc.setFill(Color.BLACK);
        gc.fillRect(200, 200, 300, 125);

        gc.setFill(Color.BLUE);
        gc.fillRect(425, 230, 75, 50);


        gc.setFill(Color.RED);
        gc.fillOval(220, 300,60,60);


        gc.setFill(Color.RED);
        gc.fillOval(420, 300,60,60);
    }
    public static void main( String [] args)
    {
        launch( args );
    }
}