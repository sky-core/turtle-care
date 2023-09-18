package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class EmployeeNameFormController implements Initializable {

    @FXML
    private JFXButton btnAddEmployee;

    @FXML
    private JFXButton btnRemoveEmployee;

    @FXML
    private JFXButton btnUpdateEmployee;

    @FXML
    private Label empId1;

    @FXML
    private Label empId10;

    @FXML
    private Label empId11;

    @FXML
    private Label empId12;

    @FXML
    private Label empId13;

    @FXML
    private Label empId14;

    @FXML
    private Label empId15;

    @FXML
    private Label empId16;

    @FXML
    private Label empId17;

    @FXML
    private Label empId18;

    @FXML
    private Label empId19;

    @FXML
    private Label empId2;

    @FXML
    private Label empId20;

    @FXML
    private Label empId21;

    @FXML
    private Label empId22;

    @FXML
    private Label empId23;

    @FXML
    private Label empId24;

    @FXML
    private Label empId25;

    @FXML
    private Label empId26;

    @FXML
    private Label empId27;

    @FXML
    private Label empId28;

    @FXML
    private Label empId3;

    @FXML
    private Label empId4;

    @FXML
    private Label empId5;

    @FXML
    private Label empId6;

    @FXML
    private Label empId7;

    @FXML
    private Label empId8;

    @FXML
    private Label empId9;

    @FXML
    private Label empName1;

    @FXML
    private Label empName10;

    @FXML
    private Label empName11;

    @FXML
    private Label empName12;

    @FXML
    private Label empName13;

    @FXML
    private Label empName14;

    @FXML
    private Label empName15;

    @FXML
    private Label empName16;

    @FXML
    private Label empName17;

    @FXML
    private Label empName18;

    @FXML
    private Label empName19;

    @FXML
    private Label empName2;

    @FXML
    private Label empName20;

    @FXML
    private Label empName21;

    @FXML
    private Label empName22;

    @FXML
    private Label empName23;

    @FXML
    private Label empName24;

    @FXML
    private Label empName25;

    @FXML
    private Label empName26;

    @FXML
    private Label empName27;

    @FXML
    private Label empName28;

    @FXML
    private Label empName3;

    @FXML
    private Label empName4;

    @FXML
    private Label empName5;

    @FXML
    private Label empName6;

    @FXML
    private Label empName7;

    @FXML
    private Label empName8;

    @FXML
    private Label empName9;

    @FXML
    private AnchorPane employeeNamePane;

    @FXML
    private Button backBtn;

    int count = 0;

    String[][] details = JDBC.getDetails("employee",7);

    @FXML
    void backBtnOnAction(ActionEvent event) throws IOException {
        employeeNamePane.getChildren().clear();
        employeeNamePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

    @FXML
    void removeBtnOnAction(ActionEvent event) {
        JDBC.setDetails("DELETE FROM turtlescare.employee WHERE empId = "+details[count][0]);
    }

    private ArrayList<Label> labelList = new ArrayList<>();

    @FXML
    void addEmployeeBtnOnAction(ActionEvent event) throws IOException {
        employeeNamePane.getChildren().clear();
        employeeNamePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/addNewEmployeeForm.fxml"))));
    }

    @FXML
    void empName1OnAction(MouseEvent event) {
        count = 0;
        btnUpdateEmployee.setDisable(!btnUpdateEmployee.isDisabled());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnUpdateEmployee.setDisable(true);
        labelList.add(empName1);
        labelList.add(empId1);
        labelList.add(empName2);
        labelList.add(empId2);
        labelList.add(empName3);
        labelList.add(empId3);
        labelList.add(empName4);
        labelList.add(empId4);
        labelList.add(empName5);
        labelList.add(empId5);
        labelList.add(empName6);
        labelList.add(empId6);
        labelList.add(empName7);
        labelList.add(empId7);
        labelList.add(empName8);
        labelList.add(empId8);
        labelList.add(empName9);
        labelList.add(empId9);
        labelList.add(empName10);
        labelList.add(empId10);
        labelList.add(empName11);
        labelList.add(empId11);
        labelList.add(empName12);
        labelList.add(empId12);
        labelList.add(empName13);
        labelList.add(empId13);
        labelList.add(empName14);
        labelList.add(empId14);
        labelList.add(empName15);
        labelList.add(empId15);
        labelList.add(empName16);
        labelList.add(empId16);
        labelList.add(empName17);
        labelList.add(empId17);
        labelList.add(empName18);
        labelList.add(empId18);
        labelList.add(empName19);
        labelList.add(empId19);
        labelList.add(empName20);
        labelList.add(empId20);
        labelList.add(empName21);
        labelList.add(empId21);
        labelList.add(empName22);
        labelList.add(empId22);
        labelList.add(empName23);
        labelList.add(empId23);
        labelList.add(empName24);
        labelList.add(empId24);
        labelList.add(empName25);
        labelList.add(empId25);
        labelList.add(empName26);
        labelList.add(empId26);
        labelList.add(empName27);
        labelList.add(empId27);
        labelList.add(empName28);
        labelList.add(empId28);

        for (int i = 0; i < labelList.size(); i += 2) {
            int detailsIndex = i / 2; // Mapping label indices to details array indices
            if (detailsIndex < details.length) { // Ensure details array bounds
                labelList.get(i).setText(details[detailsIndex][1]); // Assigning details[i][1] to even indices
                labelList.get(i + 1).setText(details[detailsIndex][0]); // Assigning details[i][0] to odd indices
            } else {
                // Handle the case where details array is smaller than the labelList
                labelList.get(i).setText(""); // Clear the text for even index label
                labelList.get(i + 1).setText(""); // Clear the text for odd index label
            }
        }
    }
}
