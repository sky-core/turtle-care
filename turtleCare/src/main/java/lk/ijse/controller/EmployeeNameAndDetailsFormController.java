package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeNameAndDetailsFormController implements Initializable {

    @FXML
    private ImageView btnBack;

    @FXML
    private TextField empAdd;

    @FXML
    private TextField empDOB;

    @FXML
    private TextField empName;

    @FXML
    private TextField empPN;

    @FXML
    private TextField empWT;

    @FXML
    private TextField joinedDate;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
