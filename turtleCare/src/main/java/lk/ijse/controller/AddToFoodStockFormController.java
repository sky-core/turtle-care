package lk.ijse.controller;

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

import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddToFoodStockFormController implements Initializable {

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
    private Pane addedSuccessfullyPane;

    @FXML
    void addFoodBtnOnAction(ActionEvent event) {
        JDBC.setDetails("INSERT INTO turtlescare.food (category, weight)\n" + "VALUES ('"+categoryOfFood.getText()+"', "+amountOfWeight.getText()+")");
        addedSuccessfullyPane.setOpacity(1.0);
    }

    @FXML
    void cancelBtnOnAction(ActionEvent event) throws IOException {
        addFoodPane.getChildren().clear();
        addFoodPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

    @FXML
    void closeBtnclickAction(MouseEvent event) {
        addedSuccessfullyPane.setOpacity(0.0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addedSuccessfullyPane.setOpacity(0.0);
    }
}
