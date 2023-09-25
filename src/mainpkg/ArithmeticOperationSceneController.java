/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label resultLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        int xVal, yVal, sum;
        String xStr, yStr;
        xStr = xTextField.getText();
        yStr = yTextField.getText();

        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        sum = xVal + yVal;
        resultLabel.setText(Integer.toString(sum));
    }

    @FXML
    private void subtractButtonOnClick(ActionEvent event) {
        int xVal, yVal, sub;
        String xStr, yStr;
        xStr = xTextField.getText();
        yStr = yTextField.getText();

        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        sub = xVal - yVal;
        resultLabel.setText(Integer.toString(sub));
    }

    @FXML
    private void multiplyButtonOnClick(ActionEvent event) {
        int xVal, yVal, multiply;
        String xStr, yStr;
        xStr = xTextField.getText();
        yStr = yTextField.getText();

        xVal = Integer.parseInt(xStr);
        yVal = Integer.parseInt(yStr);
        multiply = xVal * yVal;
        resultLabel.setText(Integer.toString(multiply));
    }

}
