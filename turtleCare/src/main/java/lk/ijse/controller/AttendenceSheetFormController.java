package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class AttendenceSheetFormController {

    @FXML
    private AnchorPane attendencePane;

    @FXML
    private ImageView btnBack;

    @FXML
    void backBtnOnAction(MouseEvent event) throws IOException {
        attendencePane.getChildren().clear();
        attendencePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

}
