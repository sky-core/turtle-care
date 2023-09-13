package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.Collection;
import java.util.Objects;

public class LoginFormController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private AnchorPane lognPage;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private Label inUserPw;

    @FXML
    private Label btnForgotPw;

    @FXML
    private Button btnFaceUnlock;

    @FXML
    void loginBtnOnAction(ActionEvent event) throws IOException {
        String[] username = new String[2];
        String[] password = new String[2];

        try {
            Connection connection = JDBC.getConnection();
            String sql = "select * from user";
            Statement statement =  connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            int i = 0;
            while (resultSet.next()){
                username[i] = resultSet.getString("userName");
                password[i] = resultSet.getString("password");
                i++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String usName = txtUsername.getText();
        String pw = txtPassword.getText();
        for (int i = 0; i < username.length; i++) {
            if (usName.equals(username[i]) && pw.equals(password[i])) {
                lognPage.getChildren().clear();
                lognPage.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/dashboardForm.fxml"))));
            }else {
                inUserPw.setText("Invalid username or password");
            }
        }
    }

    @FXML
    void ForgotPwbtnOnAction(MouseEvent event) throws IOException {
        lognPage.getChildren().clear();
        lognPage.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/forgotPasswordForm.fxml"))));
    }

    @FXML
    void faceUnlockBtnOnAction(ActionEvent event) {

    }
}
