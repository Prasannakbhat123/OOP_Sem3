import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create input fields
        TextField nameField = new TextField();
        TextField empIDField = new TextField();
        TextField designationField = new TextField();
        TextField basicPayField = new TextField();
        TextField licField = new TextField();

        // Create labels for input fields
        nameField.setPromptText("Name");
        empIDField.setPromptText("Employee ID");
        designationField.setPromptText("Designation");
        basicPayField.setPromptText("Basic Pay");
        licField.setPromptText("LIC");

        // Create button to submit the data
        Button submitButton = new Button("Submit");
        Label resultLabel = new Label();

        submitButton.setOnAction(e -> {
            try {
                // Get input values
                String name = nameField.getText();
                String empID = empIDField.getText();
                String designation = designationField.getText();
                double basicPay = Double.parseDouble(basicPayField.getText());
                double lic = Double.parseDouble(licField.getText());

                // Create Employee object
                Employee employee = new Employee(name, empID, designation, basicPay, lic);

                // Display employee information
                resultLabel.setText(String.format(
                    "Name: %s\nEmployee ID: %s\nDesignation: %s\nBasic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nLIC: %.2f\nNet Salary: %.2f",
                    employee.getName(), employee.getEmpID(), employee.getDesignation(), 
                    employee.getBasicPay(), employee.getDA(), employee.getHRA(), 
                    employee.getPF(), employee.getLIC(), employee.getNetSalary()
                ));

            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numeric values for Basic Pay and LIC.");
            }
        });

        // Create layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(nameField, empIDField, designationField, basicPayField, licField, submitButton, resultLabel);

        // Set up the scene
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Employee Information Input");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Employee class definition
    class Employee {
        private String name;
        private String empID;
        private String designation;
        private double basicPay;
        private double DA;
        private double HRA;
        private double PF;
        private double LIC; 
        private double netSalary;

        public Employee(String name, String empID, String designation, double basicPay, double LIC) {
            this.name = name;
            this.empID = empID;
            this.designation = designation;
            this.basicPay = basicPay;
            this.LIC = LIC;
            calculateAllowances();
        }

        private void calculateAllowances() {
            DA = 0.4 * basicPay; // 40% of basicPay
            HRA = 0.15 * basicPay; // 15% of basicPay
            PF = 0.12 * basicPay; // 12% of basicPay
            netSalary = basicPay + DA + HRA - PF - LIC; // Calculating netSalary
        }

        // Getters for displaying information
        public String getName() {
            return name;
        }

        public String getEmpID() {
            return empID;
        }

        public String getDesignation() {
            return designation;
        }

        public double getBasicPay() {
            return basicPay;
        }

        public double getDA() {
            return DA;
        }

        public double getHRA() {
            return HRA;
        }

        public double getPF() {
            return PF;
        }

        public double getLIC() {
            return LIC;
        }

        public double getNetSalary() {
            return netSalary;
        }
    }
}
