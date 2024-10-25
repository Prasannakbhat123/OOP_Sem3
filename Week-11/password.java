import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class password extends Application{

	public static void main(String args[]){
		launch(args);
	}

	public void start(Stage myStage){

		Label welcome= new Label("Welcome");
		Label username= new Label("User Name:");
		Label password= new Label("Password:");
		Label success= new Label();

		TextField un= new TextField();
		PasswordField pw= new PasswordField();

		Button btn= new Button("Sign in");

		GridPane grid= new GridPane();

		grid.setMinSize(400,200);
		grid.setPadding(new Insets(10, 10, 10, 10)); 
      	grid.setVgap(5); 
      	grid.setHgap(5);       
      	grid.setAlignment(Pos.CENTER); 

      	btn.setOnAction(new EventHandler <ActionEvent>(){
			public void handle(ActionEvent ae){
				String s="Welcome ";
				s=s+un.getText();
				success.setText(s);
			}
		});

      	grid.add(welcome, 0, 10);
      	grid.add(username, 0, 20);
      	grid.add(un, 10, 20);
      	grid.add(password, 0, 30);
      	grid.add(pw, 10, 30);
      	grid.add(btn, 60,60);
      	grid.add(success,0,40);

		Scene myScene= new Scene(grid);
		myStage.setTitle("JavaFX Welcome");
		myStage.setScene(myScene);
		myStage.show();
	}
}

