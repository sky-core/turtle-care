package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomeFormController implements Initializable {

    @FXML
    private JFXButton changeHeat;

    @FXML
    private Label daysForHatch;

    @FXML
    private Label divisionNumber;

    @FXML
    private Label donName1;

    @FXML
    private Label donName2;

    @FXML
    private Label donPrice1;

    @FXML
    private Label donPrice2;

    @FXML
    private Label eggRoomCelcius;

    @FXML
    private AnchorPane homePane;

    @FXML
    private Label inShowRoom;

    @FXML
    private Label spaceShowRoom;

    @FXML
    private Label todCusCount;

    @FXML
    private Label todIncome;

    @FXML
    private Label viewMoreDon;

    @FXML
    void changeHeatBtnOnAction(ActionEvent event) throws IOException {
        homePane.getChildren().clear();
        homePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/eggsRoomForm.fxml"))));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
