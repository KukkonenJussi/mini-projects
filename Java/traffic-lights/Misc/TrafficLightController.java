package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class TrafficLightController {

    @FXML
    private ToggleGroup radGroup;

    @FXML
    private Circle greenLight;

    @FXML
    private Circle redLight;

    @FXML
    private Circle yellowLight;

    @FXML
    void btnClosePressed(MouseEvent event) {    // Button to close the application
        Platform.exit();
    }

    @FXML
    void btnResetPressed(MouseEvent event) {    // Button to reset traffic lights
        redLight.setFill(Color.WHITE);
        yellowLight.setFill(Color.WHITE);
        greenLight.setFill(Color.WHITE);
    }

    @FXML
    void radRedPressed(MouseEvent event) {
        redLight.setFill(Color.RED);
        yellowLight.setFill(Color.WHITE);
        greenLight.setFill(Color.WHITE);
    }

    @FXML
    void radYellowPressed(MouseEvent event) {
            redLight.setFill(Color.WHITE);
            yellowLight.setFill(Color.YELLOW);
            greenLight.setFill(Color.WHITE);
        }

    @FXML
    void radGreenPressed(MouseEvent event) {
        redLight.setFill(Color.WHITE);
        yellowLight.setFill(Color.WHITE);
        greenLight.setFill(Color.GREEN);
    }

}
