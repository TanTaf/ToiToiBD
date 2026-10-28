package com.toitoi.bd.toitoibd.Controller;

import com.toitoi.bd.toitoibd.DbConnect;
import com.toitoi.bd.toitoibd.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginController {
   public PreparedStatement statement;
   public ResultSet resultSet;
   public Connection con;
    @FXML
    private PasswordField password1;

    @FXML
    private Button loginbtn1;

    @FXML
    private PasswordField password2;
    @FXML
    private Button loginbtn;
    @FXML
    private Pane loginPane;
    @FXML
    private Pane registrationpane;
    @FXML
    private TextField user_name1;

    @FXML
    private PasswordField password;

    @FXML
    public TextField user_name;

    @FXML
    public void onLogIn() throws SQLException, IOException {
        con = DbConnect.getConnect();
        final String query = "SELECT * FROM userinfo WHERE uname = ? and password = ?";
        statement = con.prepareStatement(query);
        statement.setString(1, user_name1.getText());
        statement.setString(2, password1.getText());
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            System.out.println("ok");
            Stage stage = (Stage) user_name.getScene().getWindow();
            BorderPane root = FXMLLoader.load(HelloApplication.class.getResource("FXML/dashbord.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Toi Toi BD");
            stage.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid Login");
            alert.setHeaderText("Incorrect username or password!!!");
            alert.setContentText("Please Enter Correct Information ");
            alert.showAndWait();
        }

    }

    @FXML
   public void onregihyper() {
    loginPane.setVisible(false);
    registrationpane.setVisible(true);
    }

    @FXML
    public void onloginhyper() {
    registrationpane.setVisible(false);
    loginPane.setVisible(true);
    }


}

