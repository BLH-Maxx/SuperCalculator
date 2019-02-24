package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Button Number0;
    @FXML private Button Number1;
    @FXML private Button Number2;
    @FXML private Button Number3;
    @FXML private Button Number4;
    @FXML private Button Number5;
    @FXML private Button Number6;
    @FXML private Button Number7;
    @FXML private Button Number8;
    @FXML private Button Number9;
    @FXML private Button Slash;
    @FXML private Button Star;
    @FXML private Button Plus;
    @FXML private Button Minus;
    @FXML private Button Equals;
    @FXML private Button CC;
    @FXML private Text displayNumber;


    StringBuilder numberAdding;
    Integer firstNum;
    Integer secondNum;
    double result;
    String Operation;
    String Answer;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Number0.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "0";
            displayNumber.setText(text);

        });
        Number1.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "1";
            displayNumber.setText(text);
        });
        Number2.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "2";
            displayNumber.setText(text);
        });
        Number3.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "3";
            displayNumber.setText(text);
        });
        Number4.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "4";
            displayNumber.setText(text);

        });
        Number5.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "5";
            displayNumber.setText(text);
        });
        Number6.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "6";
            displayNumber.setText(text);
        });

        Number7.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "7";
            displayNumber.setText(text);
        });
        Number8.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "8";
            displayNumber.setText(text);
        });
        Number9.setOnAction(event ->{
            String text = displayNumber.getText();
            text = text + "9";
            displayNumber.setText(text);
        });
        Slash.setOnAction(event ->{
            String text = displayNumber.getText();
            firstNum = Integer.parseInt(text);
            displayNumber.setText("");
            Operation = "Slash";
        });
        Star.setOnAction(event ->{
            String text = displayNumber.getText();
            firstNum = Integer.parseInt(text);
            displayNumber.setText("");
            Operation = "Star";
        });
        Plus.setOnAction(event ->{
            String text = displayNumber.getText();
            firstNum = Integer.parseInt(text);
            displayNumber.setText("");
            Operation = "+";
        });
        Minus.setOnAction(event ->{
            String text = displayNumber.getText();
            firstNum = Integer.parseInt(text);
            displayNumber.setText("");
            Operation = "-";


        });
        Equals.setOnAction(event ->{
            double text = Double.parseDouble(displayNumber.getText());
            if(Operation == "+"){
                result = firstNum + text;
            }
            else if(Operation == "-"){
                result = firstNum - text;
            }
            else if(Operation == "Star"){
                result = firstNum * text;
            }
            else if(Operation == "Slash"){
                result = firstNum / text;
            }

            displayNumber.setText(Double.toString(result));
        });
        CC.setOnAction(event ->{
            displayNumber.setText("");

        });
    }

}
