package lk.ijse.controller;

import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.sql.*;

public class EggsRoomFormController {

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

    void findNumberOfDaysForTheHatch(){
        String[][] details = JDBC.getDetails("hatchery",4);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/turtlescare", "root", "Kavindu@1125")) {
            String query = "SELECT MIN(hatchingDate) AS smallest_date FROM hatchery";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                if (resultSet.next()) {
                    Date smallestDate = resultSet.getDate("hatchingDate");
                    System.out.println(smallestDate);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onmouseclick(MouseEvent event) {

    }

}
