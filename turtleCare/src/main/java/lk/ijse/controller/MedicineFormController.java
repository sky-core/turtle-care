package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class MedicineFormController {

    @FXML
    private JFXButton bckBtn;

    @FXML
    private AnchorPane medicinePane;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        medicinePane.getChildren().clear();
        medicinePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

}
