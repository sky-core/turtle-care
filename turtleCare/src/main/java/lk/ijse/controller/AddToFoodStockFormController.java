package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.util.Objects;

public class AddToFoodStockFormController {

    @FXML
    private TextField categoryOfFood;

    @FXML
    private TextField amountOfWeight;

    @FXML
    private JFXButton btnAddFood;

    @FXML
    private JFXButton btnCancelToFood;

    @FXML
    private AnchorPane addFoodPane;

    @FXML
    void addFoodBtnOnAction(ActionEvent event) {
        JDBC.setDetails("INSERT INTO turtlescare.food (category, weight)\n" + "VALUES ('"+categoryOfFood.getText()+"', "+amountOfWeight.getText()+")");
    }

    @FXML
    void cancelBtnOnAction(ActionEvent event) throws IOException {
        addFoodPane.getChildren().clear();
        addFoodPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

}
