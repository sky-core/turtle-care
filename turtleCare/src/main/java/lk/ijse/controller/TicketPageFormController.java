package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.ResourceBundle;

public class TicketPageFormController implements Initializable {

    @FXML
    private Label earningsFromTicket;

    @FXML
    private BarChart<?, ?> lMonthTIcketsIssues;

    @FXML
    private JFXButton newDon;

    @FXML
    private AnchorPane ticketsPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("1",500));
        series.getData().add(new XYChart.Data("2",650));
        series.getData().add(new XYChart.Data("3",900));
        series.getData().add(new XYChart.Data("4",400));
        series.getData().add(new XYChart.Data("5",800));
        series.getData().add(new XYChart.Data("6",600));
        series.getData().add(new XYChart.Data("7",500));
        series.getData().add(new XYChart.Data("8",800));
        series.getData().add(new XYChart.Data("9",600));
        series.getData().add(new XYChart.Data("10",500));
        series.getData().add(new XYChart.Data("11",300));
        series.getData().add(new XYChart.Data("12",505));
        series.getData().add(new XYChart.Data("13",450));
        series.getData().add(new XYChart.Data("14",375));
        series.getData().add(new XYChart.Data("15",200));
        series.getData().add(new XYChart.Data("16",560));
        series.getData().add(new XYChart.Data("17",258));
        series.getData().add(new XYChart.Data("18",486));
        series.getData().add(new XYChart.Data("19",365));
        series.getData().add(new XYChart.Data("20",248));
        series.getData().add(new XYChart.Data("21",957));
        series.getData().add(new XYChart.Data("22",264));
        series.getData().add(new XYChart.Data("23",297));
        series.getData().add(new XYChart.Data("24",459));
        series.getData().add(new XYChart.Data("25",750));
        series.getData().add(new XYChart.Data("26",70));
        series.getData().add(new XYChart.Data("27",290));
        series.getData().add(new XYChart.Data("28",245));
        series.getData().add(new XYChart.Data("29",162));
        series.getData().add(new XYChart.Data("30",345));

//        for (XYChart.Data<String, Number> data : series.getData()) {
//            data.getNode().setStyle("-fx-bar-fill: green;"); // Change color to green
//        }


//        String[][] details = JDBC.getDetails("ticket",3);
//        for (int i = 1; i <= details.length; i++) {
//            series.getData().add(new XYChart.Data(""+i,));
//        }
        lMonthTIcketsIssues.getData().addAll(series);

    }

//    public void getCount(){
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/turtlescare", "root", "Kavindu@1125");
//
//            // Specify the date you want to count records for
//            Timestamp targetDate = Timestamp.valueOf("2023-09-15 00:00:00"); // Replace with your desired date and time
//
//            // SQL query to count records for a specific day
//            String sql = "SELECT COUNT(*) FROM ticket WHERE DATE(date_column) = ";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setTimestamp(1, targetDate);
//
//            // Execute the query
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                int count = resultSet.getInt(1);
//                System.out.println("Count of records for " + targetDate + ": " + count);
//            }
//
//            resultSet.close();
//            preparedStatement.close();
//            connection.close();
//        } catch (SQLException | SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void setlMonthTIcketsIssues(){
//        //Defining the x axis
//        CategoryAxis xAxis = new CategoryAxis();
//
////        xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(
////                "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30")));
////        xAxis.setLabel("category");
//        String[] customCategories = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
//        xAxis.setCategories(FXCollections.observableArrayList(Arrays.asList(customCategories)));
//
//        XYChart.Series<String, Number> series = new XYChart.Series<>();
//        series.getData().add(new XYChart.Data<>("1", 1000));
//        series.getData().add(new XYChart.Data<>("2", 500));
//        series.getData().add(new XYChart.Data<>("3", 800));
//        series.getData().add(new XYChart.Data<>("4", 200));
//        series.getData().add(new XYChart.Data<>("5", 100));
//
//        lMonthTIcketsIssues.getData().setAll(series);
//    }
}
