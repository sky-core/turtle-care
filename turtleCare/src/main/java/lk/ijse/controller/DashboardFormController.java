package lk.ijse.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;


public class DashboardFormController{
    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane bodyPane;
    @FXML
    private Button eggBtn;

    @FXML
    private Button empBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button setingBtn;

    @FXML
    private Button tiktBtn;

    @FXML
    private Button transBtn;

    @FXML
    private Button trtlBtn;

    @FXML
    private ImageView changeTicketIcon;

    @FXML
    void initialize(){
        loadUi();
    }

    private void loadUi() {
        homeBtn.fire();
    }

    @FXML
    void eggBtnOnAction(ActionEvent event) throws IOException {
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/eggsRoomForm.fxml"))));
    }

    @FXML
    void empBtnOnAction(ActionEvent event) throws IOException {
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

    @FXML
    void homeBtnOnAction(ActionEvent event) {
        Thread thread = new Thread(() -> Platform.runLater(() -> {
            try {
                bodyPane.getChildren().clear();
                bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/homeForm.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
        thread.start();
    }

    @FXML
    void setingBtnOnAction(ActionEvent event) throws IOException {
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/settingForm.fxml"))));
    }

    @FXML
    void tiktBtnOnAction(ActionEvent event) throws IOException {
//        Image newImage = new Image("assest/naviBarIcons/tickets2.png");
//        changeTicketIcon.setImage(newImage);
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/ticketPageForm.fxml"))));
    }

    @FXML
    void transBtnOnAction(ActionEvent event) throws IOException {
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/transactionForm.fxml"))));
    }

    @FXML
    void trtlBtnOnAction(ActionEvent event) throws IOException {
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

    public AnchorPane getRootPane(){
        return this.rootPane;
    }

    public void setRootPane(AnchorPane rootPane){
        this.rootPane = rootPane;
    }
}
