package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lk.ijse.JDBC;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class ForgotPasswordFormController {

    @FXML
    private JFXButton btnReset;

    @FXML
    private AnchorPane forgetPassword;

    @FXML
    private Button btnBack;

    @FXML
    void backBtnOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();

        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/loginForm.fxml")));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Login page");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }
    @FXML
    void resetBtnOnAction(ActionEvent event) throws IOException {

    }

}
