package lk.ijse.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.JDBC;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class TurtlePatientFormController implements Initializable {

    @FXML
    private Button btnBack;

    @FXML
    private ImageView imageViewOfPane1;

    @FXML
    private ImageView imageViewOfPane10;

    @FXML
    private ImageView imageViewOfPane11;

    @FXML
    private ImageView imageViewOfPane12;

    @FXML
    private ImageView imageViewOfPane13;

    @FXML
    private ImageView imageViewOfPane14;

    @FXML
    private ImageView imageViewOfPane15;

    @FXML
    private ImageView imageViewOfPane16;

    @FXML
    private ImageView imageViewOfPane2;

    @FXML
    private ImageView imageViewOfPane3;

    @FXML
    private ImageView imageViewOfPane4;

    @FXML
    private ImageView imageViewOfPane5;

    @FXML
    private ImageView imageViewOfPane6;

    @FXML
    private ImageView imageViewOfPane7;

    @FXML
    private ImageView imageViewOfPane8;

    @FXML
    private ImageView imageViewOfPane9;

    @FXML
    private Pane patientPane1;

    @FXML
    private Pane patientPane10;

    @FXML
    private Pane patientPane11;

    @FXML
    private Pane patientPane12;

    @FXML
    private Pane patientPane13;

    @FXML
    private Pane patientPane14;

    @FXML
    private Pane patientPane15;

    @FXML
    private Pane patientPane16;

    @FXML
    private Pane patientPane2;

    @FXML
    private Pane patientPane3;

    @FXML
    private Pane patientPane4;

    @FXML
    private Pane patientPane5;

    @FXML
    private Pane patientPane6;

    @FXML
    private Pane patientPane7;

    @FXML
    private Pane patientPane8;

    @FXML
    private Pane patientPane9;

    @FXML
    private AnchorPane turtlePatientPane;

    @FXML
    private Label nameOfTurtle;

    @FXML
    private JFXTextArea pInjuries;

    @FXML
    private JFXTextArea pMedicine;

    @FXML
    private JFXTextArea resoinForStanding;

    @FXML
    private Label pWeight;

    int count =0;

    String[][] details = JDBC.getDetails("turtle",8);


    @FXML
    void backBtnOnAction(ActionEvent event) throws IOException {
        turtlePatientPane.getChildren().clear();
        turtlePatientPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/turtleForm.fxml"))));
    }

    @FXML
    void patientPane10OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane10.setImage(image1);
        imageViewOfPane10.setFitHeight(60.00);
        count = 10;
        setDetails();
    }

    @FXML
    void patientPane10OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane10.setImage(image1);
        imageViewOfPane10.setFitHeight(42.00);
    }

    @FXML
    void patientPane11OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane11.setImage(image1);
        imageViewOfPane11.setFitHeight(60.00);
        count = 1;
        setDetails();
    }

    @FXML
    void patientPane11OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane11.setImage(image1);
        imageViewOfPane11.setFitHeight(42.00);
    }

    @FXML
    void patientPane12OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane12.setImage(image1);
        imageViewOfPane12.setFitHeight(60.00);
        count = 12;
        setDetails();
    }

    @FXML
    void patientPane12OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane12.setImage(image1);
        imageViewOfPane12.setFitHeight(42.00);
    }

    @FXML
    void patientPane13OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane13.setImage(image1);
        imageViewOfPane13.setFitHeight(60.00);
        count = 13;
        setDetails();
    }

    @FXML
    void patientPane13OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane13.setImage(image1);
        imageViewOfPane13.setFitHeight(42.00);
    }

    @FXML
    void patientPane14OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane14.setImage(image1);
        imageViewOfPane14.setFitHeight(60.00);
        count = 14;
        setDetails();
    }

    @FXML
    void patientPane14OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane14.setImage(image1);
        imageViewOfPane14.setFitHeight(42.00);
    }

    @FXML
    void patientPane15OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane15.setImage(image1);
        imageViewOfPane15.setFitHeight(60.00);
        count = 15;
        setDetails();
    }

    @FXML
    void patientPane15OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane15.setImage(image1);
        imageViewOfPane15.setFitHeight(42.00);
    }

    @FXML
    void patientPane16OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane16.setImage(image1);
        imageViewOfPane16.setFitHeight(60.00);
        count = 16;
        setDetails();
    }

    @FXML
    void patientPane16OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane16.setImage(image1);
        imageViewOfPane16.setFitHeight(42.00);
    }

    @FXML
    void patientPane3OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane3.setImage(image1);
        imageViewOfPane3.setFitHeight(60.00);
        count = 3;
        setDetails();
    }

    @FXML
    void patientPane3OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane3.setImage(image1);
        imageViewOfPane3.setFitHeight(42.00);
    }

    @FXML
    void patientPane4OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane4.setImage(image1);
        imageViewOfPane4.setFitHeight(60.00);
        count = 4;
        setDetails();
    }

    @FXML
    void patientPane4OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane4.setImage(image1);
        imageViewOfPane4.setFitHeight(42.00);
    }

    @FXML
    void patientPane5OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane5.setImage(image1);
        imageViewOfPane5.setFitHeight(60.00);
        count = 5;
        setDetails();
    }

    @FXML
    void patientPane5OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane5.setImage(image1);
        imageViewOfPane5.setFitHeight(42.00);
    }

    @FXML
    void patientPane6OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane6.setImage(image1);
        imageViewOfPane6.setFitHeight(60.00);
        count = 6;
        setDetails();
    }

    @FXML
    void patientPane6OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane6.setImage(image1);
        imageViewOfPane6.setFitHeight(42.00);
    }

    @FXML
    void patientPane7OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane7.setImage(image1);
        imageViewOfPane7.setFitHeight(60.00);
        count = 7;
        setDetails();
    }

    @FXML
    void patientPane7OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane7.setImage(image1);
        imageViewOfPane7.setFitHeight(42.00);
    }

    @FXML
    void patientPane8OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane8.setImage(image1);
        imageViewOfPane8.setFitHeight(60.00);
        count = 8;
        setDetails();
    }

    @FXML
    void patientPane8OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane8.setImage(image1);
        imageViewOfPane8.setFitHeight(42.00);
    }

    @FXML
    void patientPane9OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane9.setImage(image1);
        imageViewOfPane9.setFitHeight(60.00);
        count = 9;
        setDetails();
    }

    @FXML
    void patientPane9OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane9.setImage(image1);
        imageViewOfPane9.setFitHeight(42.00);
    }

    @FXML
    void patientPane1OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane1.setImage(image1);
        imageViewOfPane1.setFitHeight(60.00);
        count = 1;
        setDetails();
    }

    @FXML
    void patientPane1OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane1.setImage(image1);
        imageViewOfPane1.setFitHeight(42.00);
    }

    @FXML
    void patientPane2OnMouseEntered(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec2.png");
        imageViewOfPane2.setImage(image1);
        imageViewOfPane2.setFitHeight(60.00);
        count = 2;
        setDetails();
    }

    @FXML
    void patientPane2OnMouseExited(MouseEvent event) {
        Image image1 = new Image("assest/bac/stockAdd/patientVec.png");
        imageViewOfPane2.setImage(image1);
        imageViewOfPane2.setFitHeight(42.00);
    }

    @FXML
    private ArrayList<Pane> patientPaneList = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        patientPaneList.add(patientPane1);
        patientPaneList.add(patientPane2);
        patientPaneList.add(patientPane3);
        patientPaneList.add(patientPane4);
        patientPaneList.add(patientPane5);
        patientPaneList.add(patientPane6);
        patientPaneList.add(patientPane7);
        patientPaneList.add(patientPane8);
        patientPaneList.add(patientPane9);
        patientPaneList.add(patientPane10);
        patientPaneList.add(patientPane11);
        patientPaneList.add(patientPane12);
        patientPaneList.add(patientPane13);
        patientPaneList.add(patientPane14);
        patientPaneList.add(patientPane15);
        patientPaneList.add(patientPane16);

        for (int i = 0; i < details.length; i++) {
            patientPaneList.get(i).setOpacity(1.00);
        }
    }

    public void setDetails(){
        try{
            nameOfTurtle.setText(details[count - 1][1]);
            resoinForStanding.setText(details[count - 1][5]);
            pInjuries.setText(details[count - 1][6]);
            pMedicine.setText(details[count - 1][7]);
            pWeight.setText(details[count - 1][4]);
        }catch (IndexOutOfBoundsException e){
            Throwable throwable;
        };
    }
}