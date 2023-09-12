package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class SalaryDetailsFormController {

    @FXML
    private Pane mo;

    @FXML
    private AnchorPane salaryDetailsPane;

    @FXML
    void btnBackOnAction(MouseEvent event) throws IOException {
        salaryDetailsPane.getChildren().clear();
        salaryDetailsPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

}
