package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Launcher;
import lk.ijse.LauncherWrapper;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

public class SettingFormController {

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


}
