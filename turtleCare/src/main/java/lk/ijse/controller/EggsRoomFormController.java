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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EggsRoomFormController implements Initializable {

    @FXML
    private Label divisionOfHatch;

    @FXML
    private Label eggsInStock;

    @FXML
    private AnchorPane eggsRoomPane;

    @FXML
    private Label numberOfDaysForHatch;

    @FXML
    private JFXSlider sliderOfControlTemp;

    @FXML
    private Label temperatureShowLbl;

    @FXML
    private JFXButton btnHatchingArea;
    public static String formattedValue;

    @FXML
    void hatchingAreaBtnOnAction(ActionEvent event) throws IOException {
        eggsRoomPane.getChildren().clear();
        eggsRoomPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/hatchingAreaForm.fxml"))));
    }

    public void setValueOfSliderOfControlTemp(){
//        temperatureShowLbl.setText(s);
        sliderOfControlTemp.valueProperty().addListener((observable, oldValue, newValue) -> {
            // Update the label text whenever the slider value changes
            formattedValue = String.format("%.2f", newValue.doubleValue());
            temperatureShowLbl.setText(formattedValue);
            JDBC.setDetails("UPDATE turtlescare.hatchery t\n" + "SET t.temperature = "+formattedValue);
        });
    }

    public void calculateAmountOfEggs() {
        String sql = "SELECT SUM(numberOfEggs) AS column_sum FROM hatchery";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/turtlescare", "root", "Kavindu@1125");
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                int sum = resultSet.getInt("column_sum");
                eggsInStock.setText(sum + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                            divisionOfHatch.setText(details[i][0]);
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
        numberOfDaysForHatch.setText(dateDifference + " days");

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        findNumberOfDaysForTheHatch();
        calculateAmountOfEggs();
        //sliderOfControlTemp.setValue(Double.parseDouble(details[0][4]));
        setValueOfSliderOfControlTemp();

        String[][] details = JDBC.getDetails("hatchery",5);
        temperatureShowLbl.setText(details[0][4]);
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String[][] details = JDBC.getDetails("hatchery",5);
                temperatureShowLbl.setText(details[0][4]);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
