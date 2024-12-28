import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Layout.VBox;
import javafx.stage.Stage;



public class VBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
     Label label = new Label("Enter Your Name: ");
     TextField textfield = new TextField();
     Button button = new Button("Submit");
      
     button.setOnAction(e -> {
        System.out.println("Hello, " + textfield.getText());

     });
     Vbox vbox = new Vbox(10);
     vbox.getChildren().addALl(label, textfield, button);

     Scene scene = new Scene(vbox, 300,200);
     primaryStage.setTitle("Vbox layout Example");
     primaryStage.setScene(scene);
     primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args)
    }   
}
