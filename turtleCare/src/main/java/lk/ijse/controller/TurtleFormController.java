package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.chrono.JapaneseDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class TurtleFormController implements Initializable {

    @FXML
    private JFXButton btnAddFood;

    @FXML
    private JFXButton btnLTShowMore;

    @FXML
    private JFXButton btnMSShowMore;

    @FXML
    private JFXButton btnTPShowMore;

    @FXML
    private Label labelFoodStock;

    @FXML
    private Label lblLittleTurtle;

    @FXML
    private Label lblTurtlePatoent;

    @FXML
    private AnchorPane turtlePane;

    public void calculateAmountOfTheFoodStock() {
        String sql = "SELECT SUM(weight) AS column_sum FROM food";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/turtlescare", "root", "Kavindu@1125");
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                double sum = resultSet.getDouble("column_sum");
                labelFoodStock.setText(""+sum);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void addFoodBtnOnAction(ActionEvent event) throws IOException {
        turtlePane.getChildren().clear();
        turtlePane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/addToFoodStockForm.fxml"))));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        calculateAmountOfTheFoodStock();

    }
}
