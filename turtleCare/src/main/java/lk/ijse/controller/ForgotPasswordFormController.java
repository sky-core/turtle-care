package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ForgotPasswordFormController {

    @FXML
    private JFXButton btnReset;

    @FXML
    private AnchorPane forgetPassword;

    @FXML
    void resetBtnOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnReset.getScene().getWindow();
        stage.close();

        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/loginForm.fxml")));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Login page");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }

}
