package lk.ijse.controller;

import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.JDBC;

import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ResourceBundle;

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

    public void findNumberOfDaysForTheHatch(){
        String[][] details = JDBC.getDetails("hatchery",4);
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
    }
}
