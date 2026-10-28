package com.toitoi.bd.toitoibd.Controller;

import com.toitoi.bd.toitoibd.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class dashboard{
    @FXML
    private Label welcomelabel;
    @FXML
    private BorderPane pane;
    @FXML
    private Button b1;


    @FXML
    public void onTransport() throws IOException {
        AnchorPane tran = FXMLLoader.load(HelloApplication.class.getResource("FXML/transport.fxml"));
        pane.setCenter(tran);
    }
    @FXML
    public void onDestination() throws IOException {
        AnchorPane tran = FXMLLoader.load(HelloApplication.class.getResource("FXML/Destination.fxml"));
        pane.setCenter(tran);
    }
    @FXML
    public void onHotel() throws IOException {
        AnchorPane tran = FXMLLoader.load(HelloApplication.class.getResource("FXML/hotel.fxml"));
        pane.setCenter(tran);
    }
    @FXML
    public void onBooking() throws IOException {
        AnchorPane tran = FXMLLoader.load(HelloApplication.class.getResource("FXML/bookind.fxml"));
        pane.setCenter(tran);
    }
    @FXML
    public void onProfile() throws IOException {
        AnchorPane tran = FXMLLoader.load(HelloApplication.class.getResource("FXML/profile.fxml"));
        pane.setCenter(tran);
    }
    @FXML
    public void onLogout() throws IOException {
        Stage stage = (Stage)b1.getParent().getScene().getWindow();
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("FXML/login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
