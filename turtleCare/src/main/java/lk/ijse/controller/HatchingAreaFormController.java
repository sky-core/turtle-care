package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HatchingAreaFormController implements Initializable {

    @FXML
    private JFXButton backBtn;

    @FXML
    private ImageView div0;

    @FXML
    private ImageView div1;

    @FXML
    private ImageView div10;

    @FXML
    private ImageView div2;

    @FXML
    private ImageView div3;

    @FXML
    private ImageView div4;

    @FXML
    private ImageView div5;

    @FXML
    private ImageView div6;

    @FXML
    private ImageView div7;

    @FXML
    private ImageView div8;

    @FXML
    private ImageView div9;

    @FXML
    private Label divisionNumber;

    @FXML
    private Label eggsCount;

    @FXML
    private AnchorPane hatchingAreaPane;

    @FXML
    private Label hatchingDate;

    private String[][] details = JDBC.getDetails("hatchery",5);
    private int count;
    private double initialWidth = 46.0;
    private double initialHeight = 46.0;
    private double multiply = 1.75;

    void setDetailsOfBlue(String text){
        count = 0;
        for (int i = 0; i < details.length; i++) {
            if (details[i][0].equals(text)) {
                String modify = details[i][0].substring(4);
                divisionNumber.setText(modify);
                eggsCount.setText(details[i][1]);
                hatchingDate.setText(details[i][3]);
                count++;
            }
            if (count == 0){
                String modify1 = text.substring(4);
                divisionNumber.setText(modify1);
                eggsCount.setText("0");
                hatchingDate.setText("0000-00-00");
            }
        }
    }

    @FXML
    void backBtnOnAction(ActionEvent event) throws IOException {
        hatchingAreaPane.getChildren().clear();
        hatchingAreaPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/eggsRoomForm.fxml"))));
    }

    @FXML
    void div0OnMouseEnteredAction(MouseEvent event) {
        div0.setFitWidth(initialHeight * multiply);
        div0.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 1");
    }

    @FXML
    void div0OnMouseExitedAction(MouseEvent event) {
        div0.setFitWidth(initialHeight);
        div0.setFitHeight(initialWidth);
    }

    @FXML
    void div10OnMouseEnteredAction(MouseEvent event) {
        div10.setFitWidth(initialHeight * multiply);
        div10.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 11");
    }

    @FXML
    void div10OnMouseExitedAction(MouseEvent event) {
        div10.setFitWidth(initialHeight);
        div10.setFitHeight(initialWidth);
    }

    @FXML
    void div1OnMouseEnteredAction(MouseEvent event) {
        div1.setFitWidth(initialHeight * multiply);
        div1.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 2");
    }

    @FXML
    void div1OnMouseExitedAction(MouseEvent event) {
        div1.setFitWidth(initialHeight);
        div1.setFitHeight(initialWidth);
    }

    @FXML
    void div2OnMouseEnteredAction(MouseEvent event) {
        div2.setFitWidth(initialHeight * multiply);
        div2.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 3");
    }

    @FXML
    void div2OnMouseExitedAction(MouseEvent event) {
        div2.setFitWidth(initialHeight);
        div2.setFitHeight(initialWidth);
    }

    @FXML
    void div3OnMouseEnteredAction(MouseEvent event) {
        div3.setFitWidth(initialHeight * multiply);
        div3.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 4");
    }

    @FXML
    void div3OnMouseExitedAction(MouseEvent event) {
        div3.setFitWidth(initialHeight);
        div3.setFitHeight(initialWidth);
    }

    @FXML
    void div4OnMouseEnteredAction(MouseEvent event) {
        div4.setFitWidth(initialHeight * multiply);
        div4.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 5");
    }

    @FXML
    void div4OnMouseExitedAction(MouseEvent event) {
        div4.setFitWidth(initialHeight);
        div4.setFitHeight(initialWidth);
    }

    @FXML
    void div5OnMouseEnteredAction(MouseEvent event) {
        div5.setFitWidth(initialHeight * multiply);
        div5.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 6");
    }

    @FXML
    void div5OnMouseExitedAction(MouseEvent event) {
        div5.setFitWidth(initialHeight);
        div5.setFitHeight(initialWidth);
    }

    @FXML
    void div6OnMouseEnteredAction(MouseEvent event) {
        div6.setFitWidth(initialHeight * multiply);
        div6.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 7");
    }

    @FXML
    void div6OnMouseExitedAction(MouseEvent event) {
        div6.setFitWidth(initialHeight);
        div6.setFitHeight(initialWidth);
    }

    @FXML
    void div7OnMouseEnteredAction(MouseEvent event) {
        div7.setFitWidth(initialHeight * multiply);
        div7.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 8");
    }

    @FXML
    void div7OnMouseExitedAction(MouseEvent event) {
        div7.setFitWidth(initialHeight);
        div7.setFitHeight(initialWidth);
    }

    @FXML
    void div8OnMouseEnteredAction(MouseEvent event) {
        div8.setFitWidth(initialHeight * multiply);
        div8.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 9");
    }

    @FXML
    void div8OnMouseExitedAction(MouseEvent event) {
        div8.setFitWidth(initialHeight);
        div8.setFitHeight(initialWidth);
    }

    @FXML
    void div9OnMouseEnteredAction(MouseEvent event) {
        div9.setFitWidth(initialHeight * multiply);
        div9.setFitHeight(initialWidth * multiply);
        setDetailsOfBlue("Div 10");
    }

    @FXML
    void div9OnMouseExitedAction(MouseEvent event) {
        div9.setFitWidth(initialHeight);
        div9.setFitHeight(initialWidth);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        div0.setFitHeight(initialWidth * multiply);
        div0.setFitWidth(initialHeight * multiply);
        for (int i = 0; i < details.length; i++) {
            if (details[i][0].equals("Div 1")) {
                String modify = details[i][0].substring(4);
                divisionNumber.setText(modify);
                eggsCount.setText(details[i][1]);
                hatchingDate.setText(details[i][3]);
            }
        }
    }
}
