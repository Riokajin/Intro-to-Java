//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField input1 = new TextField();
        input1.setPromptText("Enter first number");

        TextField input2 = new TextField();
        input2.setPromptText("Enter second number");
 
        // Step 2: Create Buttons for operations
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Result will appear here");
       
        // Step 4: HBox for buttons
        HBox buttonRow = new HBox(10); // spacing of 10 pixels
        buttonRow.getChildren().addAll(addButton, subtractButton, multiplyButton, divideButton);
       
        // Step 5: VBox main layout
        VBox layout = new VBox(10); // spacing of 10 pixels
        layout.getChildren().addAll(input1, input2, buttonRow, resultLabel);
       
        // Step 6: Event handling for buttons

        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });
       
        subtractButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        multiplyButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        divideButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero");
                } else {
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });
        // Step 7: Create scene and show stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.show();
       
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
 
// EXPECTED OUTPUT:
// Example 1:
 
// Input1: 10
// Input2: 5
// Click '+'
// Result: 15.0
 
 
// Example 2:
 
// Input1: 8
// Input2: 0
// Click '/'
// Result: Error: Division by zero
 
 
// Example 3:
 
// Input1: 7
// Input2: 3
// Click '*'
// Result: 21.0