package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import lk.ijse.util.Navigation;
import lk.ijse.util.Rout;

import java.io.IOException;


public class DashboardFormController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane bodyPane;
    @FXML
    private Button eggBtn;

    @FXML
    private Button empBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button setingBtn;

    @FXML
    private Button tiktBtn;

    @FXML
    private Button transBtn;

    @FXML
    private Button trtlBtn;

    @FXML
    void eggBtnOnAction(ActionEvent event) {

    }

    @FXML
    void empBtnOnAction(ActionEvent event) {

    }

    @FXML
    void homeBtnOnAction(ActionEvent event) {
        try {
            Navigation.navigation(Rout.HOME,bodyPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void setingBtnOnAction(ActionEvent event) {

    }

    @FXML
    void tiktBtnOnAction(ActionEvent event) {

    }

    @FXML
    void transBtnOnAction(ActionEvent event) {

    }

    @FXML
    void trtlBtnOnAction(ActionEvent event) {

    }
}
