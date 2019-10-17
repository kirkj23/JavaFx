import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;

public class DrawingShapes extends Application{
    @Override
    public void start( Stage stage) throws Exception{
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
                stage, "Shell Graphics Application", 700, 400);
        gc.setStroke(Color.CORAL);
        gc.strokeText("Maria", 15, 27);
        gc.setStroke(Color.BLUEVIOLET);
        gc.strokeLine(35, 78, 200, 300);
        Random randy = new Random();
        int red = randy.nextInt(0xFF);
        int blue = randy.nextInt(0xFF);
        int green = randy.nextInt(0xFF);
        Color randyColor = Color.rgb(red, green, blue);
        gc.setStroke(randyColor);
        gc.setLineWidth(10);
        gc.strokeLine(50, 50, 200, 500);

        gc.setStroke(randyColor);
        gc.fillRect(200, 200, 50, 50);
        gc.strokeRect(200, 200, 50, 50);

        gc.setStroke(randyColor);
        gc.fillOval(030, 40,50,60);
        gc.strokeOval(30, 40,50,60);

    }
    public static void main( String [] args)
    {
        launch( args );
    }
}