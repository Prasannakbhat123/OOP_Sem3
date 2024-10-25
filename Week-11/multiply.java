import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;

public class multiply extends Application{

	public static void main(String args[]){
		launch(args);
	}

	public void start(Stage myStage){
		FlowPane root= new FlowPane(10,10);
		root.setAlignment(Pos.CENTER);

		TextField input= new TextField();
		input.setPromptText("Enter an Integer:");

		Label myLabel= new Label();

		Button btn= new Button("Generate Table");

		btn.setOnAction(new EventHandler <ActionEvent>(){

			public void handle(ActionEvent ae){
				int number=Integer.parseInt(input.getText());

				StringBuilder table= new StringBuilder();
				for(int i=0; i<=10; i++){
					table.append(number).append("x").append(i).append("=").append(number*i).append("\n");

				}
				myLabel.setText(table.toString());
			}
		});

		root.getChildren().addAll(new Label("Enter a number:"), input, btn, myLabel);

		Scene myScene= new Scene(root, 500, 200);
		myStage.setTitle("Multiplcation Table");
		myStage.setScene(myScene);
		myStage.show();
	}
}