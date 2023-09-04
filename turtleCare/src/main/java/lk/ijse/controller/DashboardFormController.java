package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class DashboardFormController {
    @FXML
    private JFXButton btn1;

    @FXML
    void onMouseEntere(MouseEvent event) {
        btn1.setBackground(Background.fill(Color.GREEN));
    }

    @FXML
    void onMouseExited(MouseEvent event) {

    }

    public void onMouseEntere(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void onMouseExited(javafx.scene.input.MouseEvent mouseEvent) {
    }
}
