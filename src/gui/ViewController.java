package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTeste;

    @FXML
    public void onBtTesteAction(){
        Alerts.showAlert("Alert title", "Alert header", "Hello", Alert.AlertType.INFORMATION);
    }
}
