module com.example.tarea5_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea5_1 to javafx.fxml;
    exports com.example.tarea5_1;
}