package com.toitoi.bd.toitoibd.Controller;

import com.toitoi.bd.toitoibd.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Destination {




    @FXML
    private Button next;



    @FXML
    void onNext(ActionEvent event) throws IOException {
        BorderPane bp =(BorderPane) next.getParent().getParent();
        Parent node = FXMLLoader.load(HelloApplication.class.getResource("FXML/transport.fxml"));
        bp.setCenter(node);
    }

    @FXML
    void onPrevious(ActionEvent event) {

    }
}
