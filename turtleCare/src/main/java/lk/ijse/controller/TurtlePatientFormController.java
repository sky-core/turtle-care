package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class TurtlePatientFormController implements Initializable {

    @FXML
    private Pane patientPane1;

    @FXML
    private Pane patientPane2;

    @FXML
    private AnchorPane turtlePatientPane;

    @FXML
    private ImageView imageViewOfPane1;

    @FXML
    private ImageView imageViewOfPane2;

    @FXML
    void patientPane1OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane1.setImage(image1);
    }

    @FXML
    void patientPane1OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane1.setImage(image1);
    }

    @FXML
    void patientPane2OnMouseEntered(MouseEvent event) {

    }

    @FXML
    void patientPane2OnMouseExited(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        patientPane1.setOpacity(0.00);
//        patientPane2.setOpacity(0.00);
    }
}
