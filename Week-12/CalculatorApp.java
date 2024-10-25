import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class CalculatorApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label label1 = new Label("Enter first number:");
        TextField input1 = new TextField();
        
        Label label2 = new Label("Enter second number:");
        TextField input2 = new TextField();
        
        Button computeButton = new Button("Compute");
        
        // Load and resize the calculator image
        Image calculatorImage = new Image("calculator.png");
        ImageView calculatorImageView = new ImageView(calculatorImage);
        calculatorImageView.setFitWidth(60); // Set desired width
        calculatorImageView.setFitHeight(60); // Set desired height
        calculatorImageView.setPreserveRatio(true); // Maintain aspect ratio

        computeButton.setGraphic(calculatorImageView);
        
        Canvas canvas = new Canvas(400, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set button action
        computeButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());

                double sum = num1 + num2;
                double product = num1 * num2;
                double difference = num1 - num2;
                double quotient = num2 != 0 ? num1 / num2 : Double.NaN; // Handle division by zero

                // Clear canvas and display results
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Sum: " + sum, 20, 40);
                gc.fillText("Product: " + product, 20, 80);
                gc.fillText("Difference: " + difference, 20, 120);
                gc.fillText("Quotient: " + (Double.isNaN(quotient) ? "Undefined (division by zero)" : quotient), 20, 160);
            } catch (NumberFormatException ex) {
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.fillText("Please enter valid numbers.", 20, 40);
            }
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(label1, 0, 0);
        grid.add(input1, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(input2, 1, 1);
        grid.add(computeButton, 0, 2, 2, 1);
        grid.add(canvas, 0, 3, 2, 1);

        // Set up the scene
        Scene scene = new Scene(grid, 450, 300);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
