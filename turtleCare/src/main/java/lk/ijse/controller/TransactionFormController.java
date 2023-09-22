package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.JDBC;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TransactionFormController implements Initializable {

    @FXML
    private Label amount1;

    @FXML
    private Label amount11;

    @FXML
    private Label amount111;

    @FXML
    private Label amount1111;

    @FXML
    private Label amount11111;

    @FXML
    private Label amount111111;

    @FXML
    private Label amount1111111;

    @FXML
    private Label amount11111111;

    @FXML
    private Label amount111111111;

    @FXML
    private Label amount1111111111;

    @FXML
    private Label amount11111111111;

    @FXML
    private Label amount111111111111;

    @FXML
    private JFXButton backBtn;

    @FXML
    private Label date1;

    @FXML
    private Label date11;

    @FXML
    private Label date111;

    @FXML
    private Label date1111;

    @FXML
    private Label date11111;

    @FXML
    private Label date111111;

    @FXML
    private Label date1111111;

    @FXML
    private Label date11111111;

    @FXML
    private Label date111111111;

    @FXML
    private Label date1111111111;

    @FXML
    private Label date11111111111;

    @FXML
    private Label date111111111111;

    @FXML
    private ImageView imageView10;

    @FXML
    private ImageView imageView11;

    @FXML
    private ImageView imageView12;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    @FXML
    private ImageView imageView4;

    @FXML
    private ImageView imageView5;

    @FXML
    private ImageView imageView6;

    @FXML
    private ImageView imageView7;

    @FXML
    private ImageView imageView8;

    @FXML
    private ImageView imageView9;

    @FXML
    private ImageView imageview1;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane10;

    @FXML
    private Pane pane11;

    @FXML
    private Pane pane12;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private Pane pane7;

    @FXML
    private Pane pane8;

    @FXML
    private Pane pane9;

    @FXML
    private Label customerName;

    @FXML
    private Label da;

    @FXML
    private Label price;

    @FXML
    private ImageView rightSideImage;

    @FXML
    private AnchorPane transactionPage;

    @FXML
    private Label type1;

    @FXML
    private Label type2;

    @FXML
    private Label type21;

    @FXML
    private Label type211;

    @FXML
    private Label type2111;

    @FXML
    private Label type21111;

    @FXML
    private Label type211111;

    @FXML
    private Label type2111111;

    @FXML
    private Label type21111111;

    @FXML
    private Label type211111111;

    @FXML
    private Label type2111111111;

    @FXML
    private Label type21111111111;

    @FXML
    void backBtnOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ArrayList<Label> dateLabels = new ArrayList<>();
        ArrayList<Label> typeLabels = new ArrayList<>();
        ArrayList<Label> amountLabels = new ArrayList<>();

        dateLabels.add(date11);
        dateLabels.add(date111);
        dateLabels.add(date1111);
        dateLabels.add(date11111);
        dateLabels.add(date111111);
        dateLabels.add(date1111111);
        dateLabels.add(date11111111);
        dateLabels.add(date111111111);
        dateLabels.add(date1111111111);
        dateLabels.add(date11111111111);
        dateLabels.add(date111111111111);

        typeLabels.add(type2);
        typeLabels.add(type21);
        typeLabels.add(type211);
        typeLabels.add(type2111);
        typeLabels.add(type21111);
        typeLabels.add(type211111);
        typeLabels.add(type2111111);
        typeLabels.add(type21111111);
        typeLabels.add(type211111111);
        typeLabels.add(type2111111111);
        typeLabels.add(type21111111111);

        amountLabels.add(amount11);
        amountLabels.add(amount111);
        amountLabels.add(amount1111);
        amountLabels.add(amount11111);
        amountLabels.add(amount111111);
        amountLabels.add(amount1111111);
        amountLabels.add(amount11111111);
        amountLabels.add(amount111111111);
        amountLabels.add(amount1111111111);
        amountLabels.add(amount11111111111);
        amountLabels.add(amount111111111111);


        String[][] donations = JDBC.getDetails("donation",4);
        String[][] ticket = JDBC.getDetails("ticket",4);

        try{
            for (int i = ticket.length - 1, j = 0;  i >= 0; i-- , j++) {
                dateLabels.get(j).setText(ticket[i][1]);
                typeLabels.get(j).setText("Tickets");
                amountLabels.get(j).setText("Rs. 300");
            }
        }catch (IndexOutOfBoundsException e){

        }


        date1.setText(donations[donations.length-1][2]);
        type1.setText("Donations");
        amount1.setText(donations[donations.length-1][1]);

        price.setText("Rs. "+donations[donations.length - 1][1] + ".00");
        customerName.setText(donations[donations.length - 1][3]);
        da.setText(donations[donations.length - 1][2]);
    }
}
