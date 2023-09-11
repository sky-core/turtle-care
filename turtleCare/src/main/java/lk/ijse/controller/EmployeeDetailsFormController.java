package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class EmployeeDetailsFormController {

    @FXML
    private Pane employeeName;

    @FXML
    private Pane attendence;

    @FXML
    private Pane salaryDetails;

    @FXML
    private Pane tWEmployeeId;

    @FXML
    private AnchorPane employeePane;

    @FXML
    private Label todWorkEmpid1;

    @FXML
    private Label todWorkEmpid10;

    @FXML
    private Label todWorkEmpid11;

    @FXML
    private Label todWorkEmpid2;

    @FXML
    private Label todWorkEmpid3;

    @FXML
    private Label todWorkEmpid4;

    @FXML
    private Label todWorkEmpid5;

    @FXML
    private Label todWorkEmpid6;

    @FXML
    private Label todWorkEmpid7;

    @FXML
    private Label todWorkEmpid8;

    @FXML
    private Label todWorkEmpid9;

    @FXML
    void employeeNameBtnOnAction(MouseEvent event) throws IOException {
        employeePane.getChildren().clear();
        employeePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeNameForm.fxml"))));
    }

    @FXML
    void attendenceBtnOnAction(MouseEvent event) throws IOException {
        employeePane.getChildren().clear();
        employeePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/attendenceSheetForm.fxml"))));
    }
}
