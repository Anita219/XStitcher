
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import logic.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/**
 * Features
 * * verschiedene Stiche: half stitch, mixed stitch, backstitch
 * * variable Größe des Patterns
 * * in GUI gestalten
 * *
 * *
 */

public class XStitcher extends Application {


    public static void main(String[] args) {
        System.out.println("main() called");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        BufferedImage img = ImageIO.read(new File("pineapple.jpg"));
        BufferedImage imagePixelated = ImageUtil.pixelate(img, 10);
        ImageIO.write(imagePixelated, "jpg", new File("image-pixelated.jpg"));


        System.out.println("start() called");
        primaryStage.setTitle("Pineapple");

        ImageView imageBefore = new ImageView(SwingFXUtils.toFXImage(img, null));
        imageBefore.setFitHeight(455);
        imageBefore.setFitWidth(500);
        imageBefore.setPreserveRatio(true);

        ImageView imageAfter = new ImageView(SwingFXUtils.toFXImage(imagePixelated, null));
        imageAfter.setFitHeight(455);
        imageAfter.setFitWidth(500);
        imageAfter.setPreserveRatio(true);
        imageAfter.setVisible(false);

        Button butt = new Button();
        butt.setText("Show pixelated");
        boolean visible = false;

        final Label labelBefore = new Label("Before");
        labelBefore.setAlignment(Pos.TOP_LEFT);
        labelBefore.setMinSize(87,20);

        final Label labelAfter = new Label("After");
        labelAfter.setAlignment(Pos.TOP_RIGHT);
        labelAfter.setMinSize(87,20);
        labelAfter.setVisible(false);

        butt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    labelAfter.setVisible(true);
                    imageAfter.setVisible(true);
            }
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.add(labelBefore, 0,0);
        grid.add(labelAfter, 2,0);
        grid.add(imageBefore, 0,1);
        grid.add(imageAfter, 2,1);
        grid.add(butt, 1, 0);
        grid.setGridLinesVisible(false);

        Scene scene = new Scene(grid, 1200,500);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(XStitcher.class.getResource("styles/XStitcher.css").toExternalForm());
        primaryStage.show();

    }

}
