package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class TicketPageFormController {

    @FXML
    private Label earningsFromTicket;

    @FXML
    private BarChart<?, ?> lMonthTIcketsIssues;

    @FXML
    private JFXButton newDon;

    @FXML
    private AnchorPane ticketsPane;

}
