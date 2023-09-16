package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import lk.ijse.ArduinoController;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public void findNumberOfDaysForTheHatch(){
        String[][] details = JDBC.getDetails("hatchery",5);
        long dateDifference = 0;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/turtlescare", "root", "Kavindu@1125")) {
            // SQL query to find the smallest date in the database
            String sql = "SELECT MIN(hatchingDate) AS smallest_date FROM hatchery";

            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {
                    Date smallestDate = resultSet.getDate("smallest_date");
                    String dates = String.valueOf(smallestDate);
                    for (int i = 0; i < details.length; i++) {
                        if (details[i][3].equals(dates)){
                            divisionNumber.setText(details[i][0]);
                            break;
                        }
                    }
                    LocalDate currentDate = LocalDate.now();
                    LocalDate smallestDateLocal = smallestDate.toLocalDate();

                    dateDifference = ChronoUnit.DAYS.between(currentDate, smallestDateLocal);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        daysForHatch.setText(dateDifference + " days");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[][] donationDetails = JDBC.getDetails("donation",4);
        donPrice1.setText("Rs. "+donationDetails[donationDetails.length-1][1]);
        donName1.setText(donationDetails[donationDetails.length-1][3]);
        donPrice2.setText("Rs. "+donationDetails[donationDetails.length-2][1]);
        donName2.setText(donationDetails[donationDetails.length-2][3]);

        findNumberOfDaysForTheHatch();
        //eggRoomCelcius.setText(details[0][4]);
        //eggRoomCelcius.setText(details[0][4]);
        ArduinoController.arduinoControl();

        String[][] details = JDBC.getDetails("hatchery",5);
        eggRoomCelcius.setText(details[0][4]);
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String[][] details = JDBC.getDetails("hatchery",5);
                eggRoomCelcius.setText(details[0][4]);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
