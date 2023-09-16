package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddNewDonationFormController implements Initializable {

    @FXML
    private JFXButton addDonation;

    @FXML
    private Pane addedSuccessfullyPane;

    @FXML
    private TextField amountOfDonate;

    @FXML
    private JFXButton cancelBtn;

    @FXML
    private ImageView closeBtn;

    @FXML
    private TextField nameOfCustomer;

    @FXML
    private AnchorPane addDonationPane;

    @FXML
    void addDonationBtnOnAction(ActionEvent event) {
        LocalDate currentDate = LocalDate.now();
        JDBC.setDetails("INSERT INTO turtlescare.donation (amountOfDonate, date, name)\n" + "VALUES ('"+amountOfDonate.getText()+"', '"+currentDate+"', '"+nameOfCustomer.getText()+"');\n" +
                "\n");
        addedSuccessfullyPane.setOpacity(1.0);
    }

    @FXML
    void cancelBtnOnAction(ActionEvent event) throws IOException {
        addDonationPane.getChildren().clear();
        addDonationPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/ticketPageForm.fxml"))));
    }

    @FXML
    void closeBtnclickAction(MouseEvent event) {
        addedSuccessfullyPane.setOpacity(0.0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addedSuccessfullyPane.setOpacity(0.0);
    }
}
