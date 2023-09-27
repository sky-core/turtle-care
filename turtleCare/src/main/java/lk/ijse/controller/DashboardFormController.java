package lk.ijse.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import lk.ijse.QrCodeReader.QrCodeScanner;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DashboardFormController{
    private ExecutorService qrScannerExecutor;

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
    private ImageView homeImage;

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
    private ImageView empImage;

    @FXML
    private ImageView transImage;

    @FXML
    private ImageView eggsImage;

    @FXML
    private ImageView turtlleImage;

    @FXML
    private ImageView settingImage;
    int count = 0;

    @FXML
    void initialize(){
        loadUi();
        startQRScanner();
    }

    private void startQRScanner() {
        qrScannerExecutor = Executors.newSingleThreadExecutor();
        qrScannerExecutor.execute(() -> {
            QrCodeScanner.qrCodeScan(); // Run the QR code scanning process continuously
        });
    }

    private void loadUi() {
        homeBtn.fire();
    }

    @FXML
    void eggBtnOnAction(ActionEvent event) throws IOException {
        btnChange();
        eggsImage.setImage(new Image("assest/naviBarIcons/egg2.png"));
        count = 5;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/eggsRoomForm.fxml"))));
    }

    @FXML
    void empBtnOnAction(ActionEvent event) throws IOException {
        btnChange();
        empImage.setImage(new Image("assest/naviBarIcons/emp2.png"));
        count = 3;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/employeeDetailsForm.fxml"))));
    }

    @FXML
    void homeBtnOnAction(ActionEvent event) {
        btnChange();
        homeImage.setImage(new Image("assest/naviBarIcons/home.png"));
        count = 1;
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
        btnChange();
        settingImage.setImage(new Image("assest/naviBarIcons/settings2.png"));
        count = 7;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/settingForm.fxml"))));
    }

    @FXML
    void tiktBtnOnAction(ActionEvent event) throws IOException {
        btnChange();
        changeTicketIcon.setImage(new Image("assest/naviBarIcons/tickets2.png"));
        count = 2;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/ticketPageForm.fxml"))));
    }

    @FXML
    void transBtnOnAction(ActionEvent event) throws IOException {
        btnChange();
        transImage.setImage(new Image("assest/naviBarIcons/transaction2.png"));
        count = 4;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/transactionForm.fxml"))));
    }

    @FXML
    void trtlBtnOnAction(ActionEvent event) throws IOException {
        btnChange();
        turtlleImage.setImage(new Image("assest/naviBarIcons/turtle2.png"));
        count = 6;
        bodyPane.getChildren().clear();
        bodyPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

    void btnChange(){
        if (count == 1){
            homeImage.setImage(new Image("assest/naviBarIcons/home2.png"));
        } else if (count == 2){
            changeTicketIcon.setImage(new Image("assest/naviBarIcons/tickets.png"));
        } else if (count == 3){
            empImage.setImage(new Image("assest/naviBarIcons/emp.png"));
        } else if (count == 4){
            transImage.setImage(new Image("assest/naviBarIcons/transaction.png"));
        } else if (count == 5){
            eggsImage.setImage(new Image("assest/naviBarIcons/egg.png"));
        } else if (count == 6){
            turtlleImage.setImage(new Image("assest/naviBarIcons/turtle.png"));
        } else if (count == 7){
            settingImage.setImage(new Image("assest/naviBarIcons/settings.png"));
        }
    }

    public AnchorPane getRootPane(){
        return this.rootPane;
    }

    public void setRootPane(AnchorPane rootPane){
        this.rootPane = rootPane;
    }
}
