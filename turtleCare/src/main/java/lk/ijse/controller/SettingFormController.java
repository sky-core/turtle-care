package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.JDBC;
import lk.ijse.Launcher;
import lk.ijse.LauncherWrapper;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class SettingFormController implements Initializable {

    @FXML
    private JFXButton addAccountBtn;

    @FXML
    private TextField conEmailAdd;

    @FXML
    private TextField confirmPwSet;

    @FXML
    private JFXButton delAccountBtn;

    @FXML
    private TextField emailAdd;

    @FXML
    private TextField fullName;

    @FXML
    private JFXButton logOutbtn;

    @FXML
    private Label nameOfProfile;

    @FXML
    private TextField pwSet;

    @FXML
    private AnchorPane settingPane;

    @FXML
    private JFXButton upNewPhoto;

    @FXML
    private JFXButton updInfobtn;

    @FXML
    private TextField userName;

    @FXML
    private Label pwIsNotMatched;

    @FXML
    private Label emailIsNotMatched1;

    @FXML
    void logOutBtnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) logOutbtn.getScene().getWindow();
        stage.close();

        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/loginForm.fxml")));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Login page");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    void updInfoBtnOnAction(ActionEvent event) throws IOException {
        int count = 0;
        if (pwSet.getText().equals(confirmPwSet.getText())){
            count++;
        }else{
            pwIsNotMatched.setText("Password is not matched");
        }
        if (emailAdd.getText().equals(conEmailAdd.getText())){
            count++;
        }else{
            emailIsNotMatched1.setText("Email is not matched");
        }
        if (count == 2){
            JDBC.setDetails("UPDATE turtlescare.user t\n" + "SET t.password = '"+pwSet.getText()+"'\n" + "WHERE t.userName LIKE '"+userName.getText()+"' ESCAPE '#';");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
