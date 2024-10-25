
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;


public class welcome extends Application{

	public static void main(String args[]){
		launch(args);
	}

	public void start(Stage myStage){

		myStage.setTitle("This is the first JavaFX Application");

		Label myLabel= new Label();
		myLabel.setText("Welcome to JavaFX programming");
		myLabel.setTextFill(Color.MAGENTA);

		FlowPane rootnode= new FlowPane();
		rootnode.getChildren().add(myLabel);

		Scene myScene= new Scene(rootnode, 500, 200);
		myStage.setScene(myScene);
		myStage.show();
	}
}