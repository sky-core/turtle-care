package lk.ijse.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;


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
    void initialize(){
        loadUi();
    }

    private void loadUi() {
        homeBtn.fire();
    }

    @FXML
    void eggBtnOnAction(ActionEvent event) {

    }

    @FXML
    void empBtnOnAction(ActionEvent event) {

    }

    @FXML
    void homeBtnOnAction(ActionEvent event) {
        Thread thread = new Thread(() -> Platform.runLater(() -> {
            try {
                bodyPane.getChildren().clear();
                bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/homeForm.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
        thread.start();
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
