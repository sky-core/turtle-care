package lk.ijse.controller.addFiles;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddNewEmployeeFormController implements Initializable {

    @FXML
    private TextField addOfEmp;

    @FXML
    private JFXButton btnAddNewEmployee;

    @FXML
    private JFXButton btnCancel;

    @FXML
    private TextField dobOfEmp;

    @FXML
    private TextField joinedDateOfEmp;

    @FXML
    private TextField nameOfEmp;

    @FXML
    private AnchorPane newEmployeePane;

    @FXML
    private TextField phoneNumOfEmp;

    @FXML
    private TextField workTimeOfEmp;

    @FXML
    private Pane addedSuccessfullyPane;

    @FXML
    void addNewEmployeeBtnOnAction(ActionEvent event) throws IOException {
        JDBC.setDetails("INSERT INTO turtlescare.employee (name, joinedDate, address, phoneNo, workingTime, dateOfBirth)VALUES ('"+nameOfEmp.getText()+"', '"+joinedDateOfEmp.getText()+"', '"+addOfEmp.getText()+"', '"+phoneNumOfEmp.getText()+"', '"+workTimeOfEmp.getText()+"', '"+dobOfEmp.getText()+"');");
        addedSuccessfullyPane.setOpacity(1.0);
    }

    @FXML
    void cancelBtnOnAction(ActionEvent event) throws IOException {
        newEmployeePane.getChildren().clear();
        newEmployeePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeNameForm.fxml"))));
    }

    @FXML
    void closeBtnclickAction(MouseEvent event) {
        addedSuccessfullyPane.setOpacity(0.0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LocalDate date = LocalDate.now();
        joinedDateOfEmp.setText(""+date);
        addedSuccessfullyPane.setOpacity(0.0);
    }
}
