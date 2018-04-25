package controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField;

    public void clearText(ActionEvent actionEvent) {
        textField.clear();
    }
}
