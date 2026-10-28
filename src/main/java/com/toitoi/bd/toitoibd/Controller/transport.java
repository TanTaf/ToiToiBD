package com.toitoi.bd.toitoibd.Controller;

import com.toitoi.bd.toitoibd.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class transport {
    @FXML
    private Button next;



    @FXML
    void onNext(ActionEvent event) throws IOException {
        BorderPane bp2 =(BorderPane) next.getParent().getParent();
        Parent node = FXMLLoader.load(HelloApplication.class.getResource("FXML/hotel.fxml"));
        bp2.setCenter(node);
    }

    @FXML
    void onPrevious(ActionEvent event) throws IOException {
        BorderPane bp2 =(BorderPane) next.getParent().getParent();
        Parent node = FXMLLoader.load(HelloApplication.class.getResource("FXML/Destination.fxml"));
        bp2.setCenter(node);
    }
}
