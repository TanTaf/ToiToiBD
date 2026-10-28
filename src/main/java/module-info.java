module com.toitoi.bd.toitoibd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.toitoi.bd.toitoibd to javafx.fxml;
    exports com.toitoi.bd.toitoibd;
    exports com.toitoi.bd.toitoibd.Controller;
    opens com.toitoi.bd.toitoibd.Controller to javafx.fxml;
}