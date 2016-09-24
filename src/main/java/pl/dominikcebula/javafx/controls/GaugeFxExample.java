package pl.dominikcebula.javafx.controls;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GaugeFxExample extends Application
{
   @FXML
   private Slider slider1;
   @FXML
   private GaugeFx gauge1;

   @FXML
   private Slider slider2;
   @FXML
   private GaugeFx gauge2;

   @FXML
   private Slider slider3;
   @FXML
   private GaugeFx gauge3;

   public static void main(String[] args)
   {
      Application.launch(GaugeFxExample.class, args);
   }

   public void start(Stage primaryStage) throws Exception
   {
      primaryStage.setScene(
         new Scene(
            FXMLLoader.<BorderPane>load(
               GaugeFxExample.class.getResource("gaugefx-example.fxml")
            )
         )
      );

      primaryStage.setTitle("GaugeFx Example");
      primaryStage.show();
   }

   @SuppressWarnings("unsed")
   public void initialize()
   {
      gauge1.progressProperty().bind(slider1.valueProperty());
      gauge2.progressProperty().bind(slider2.valueProperty());
      gauge3.progressProperty().bind(slider3.valueProperty());
   }
}
