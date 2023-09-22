package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class SalaryDetailsFormController implements Initializable {

    @FXML
    private Label empCount;

    @FXML
    private Label employeeCount;

    @FXML
    private Pane mo;

    @FXML
    private AnchorPane salaryDetailsPane;

    @FXML
    private Label grd6;


    @FXML
    void btnBackOnAction(MouseEvent event) throws IOException {
        salaryDetailsPane.getChildren().clear();
        salaryDetailsPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int count = JDBC.checkRowsCount("employee");
        employeeCount.setText(count + "");
        empCount.setText((count - 1) + "");
        grd6.setText("1");
    }
}
