package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    private Button btnBack;

    @FXML
    private JFXButton btnOTP;

    @FXML
    private JFXButton btnReset;

    @FXML
    private TextField emailAddress;

    @FXML
    private AnchorPane forgetPassword;

    @FXML
    private TextField fullName;

    @FXML
    private PasswordField lastPw;

    @FXML
    private PasswordField newPw;

    @FXML
    private TextField userName;

    @FXML
    private Label wrongPw;

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
    void resetBtnOnAction(ActionEvent event) throws IOException, SQLException {
        String[][] details = JDBC.getDetails("user",6);

        for (int i = 0; i < details[i].length; i++) {
            if (details[i][5].equals(lastPw.getText()) && details[i][1].equals(userName.getText())){
                JDBC.setDetails("UPDATE turtlescare.user t\n" +
                        "SET t.lastPassword = '"+ details[i][3] +"'\n" +
                        "WHERE t.userId LIKE '"+ details[i][0] +"' ESCAPE '#'");

                JDBC.setDetails("UPDATE turtlescare.user t\n" +
                        "SET t.password = '"+ newPw.getText() +"'\n" +
                        "WHERE t.userId LIKE '"+ details[i][0] +"' ESCAPE '#'");
                Stage stage = (Stage) btnReset.getScene().getWindow();
                stage.close();

                Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/loginForm.fxml")));

                Scene scene = new Scene(rootNode);

                stage.setTitle("Login page");
                stage.centerOnScreen();
                stage.setScene(scene);

                stage.show();
                break;
            } else {
                wrongPw.setText("your last password is invalid");
            }
        }
    }
}
