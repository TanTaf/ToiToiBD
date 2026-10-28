package com.toitoi.bd.toitoibd.Controller;

import com.toitoi.bd.toitoibd.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class registrationController {
    @FXML
    private PasswordField cpass;

    @FXML
    private TextField fname;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField phone;

    @FXML
    private TextField uname;
    @FXML
    private Button registration;
    @FXML
    void onRegistrationbtn(ActionEvent event) {

    }

    @FXML
    void onloginhyper(ActionEvent event) throws IOException {
        Stage stage = (Stage) uname.getParent().getScene().getWindow();
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("FXML/login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
