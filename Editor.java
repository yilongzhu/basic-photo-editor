import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;

public class Editor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Basic Photo Editor");

        FileInputStream in = new FileInputStream("image.jpg");
        Image image = new Image(in);
        ImageView imageView = new ImageView(image);

        HBox hb = new HBox(imageView);

        Scene scene = new Scene(hb, 1000, 1000);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}