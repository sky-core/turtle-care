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

import java.io.IOException;
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

    private String username = "kavindu";
    private String password = "1125";

    @FXML
    void loginBtnOnAction(ActionEvent event) throws IOException {
        String usName = txtUsername.getText();
        String pw = txtPassword.getText();
        if (usName.equals(username) && pw.equals(password)) {
            lognPage.getChildren().clear();
            lognPage.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/dashboardForm.fxml"))));
        }else {
            inUserPw.setText("Invalid username or password");
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

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
