package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    double def = 0;
    double n1, n2;
    char operator;
    int point;

    @FXML
    private TextField display;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button add;

    @FXML
    private Button subtract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button dot;

    @FXML
    private Button total;

    @FXML
    private Button clear;

    @FXML
    private Button reverse;

    @FXML
    private void calculate(ActionEvent event) {

        if(event.getSource() == zero) {
            display.appendText("0");
        }
        else if (event.getSource() == one) {
            display.appendText("1");
        }
        else if (event.getSource() == two) {
            display.appendText("2");
        }
        else if (event.getSource() == three) {
            display.appendText("3");
        }
        else if (event.getSource() == four) {
            display.appendText("4");
        }
        else if (event.getSource() == five) {
            display.appendText("5");
        }
        else if (event.getSource() == six) {
            display.appendText("6");
        }
        else if (event.getSource() == seven) {
            display.appendText("7");
        }
        else if (event.getSource() == eight) {
            display.appendText("8");
        }
        else if (event.getSource() == nine) {
            display.appendText("9");
        }
        else if (event.getSource() == dot && point == 0) {
            display.setText(".");
            point = 1;
        }

        else if (event.getSource() == add) {
            n1 = Double.parseDouble(display.getText());
            display.setText("");
            operator = '+';
            point = 0;
        }

        else if (event.getSource() == subtract) {
            n1 = Double.parseDouble(display.getText());
            display.setText("");
            operator = '-';
            point = 0;
        }

        else if (event.getSource() == multiply) {
            n1 = Double.parseDouble(display.getText());
            display.setText("");
            operator = '*';
            point = 0;
        }

        else if (event.getSource() == divide) {
            n1 = Double.parseDouble(display.getText());
            display.setText("");
            operator = '/';
            point = 0;
        }

        else if (event.getSource() == reverse) {
            n1 = Double.parseDouble(display.getText());
            n1 = n1 * (-1);
            display.setText(String.valueOf(n1));
            point = 0;
        }

        else if (event.getSource() == total) {

            n2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    def = n1 + n2;
                    break;
                case '-':
                    def = n1 - n2;
                    break;
                case '*':
                    def = n1 * n2;
                    break;
                case '/':
                    def = n1 / n2;
                    break;
                default:
                    display.setText("Error");
            }
            display.setText(String.valueOf(def));
        }

        else if (event.getSource() == clear) {
            n1 = 0;
            n2 = 0;
            display.setText("");
            operator = 0;
            point = 0;
        }
    }
}