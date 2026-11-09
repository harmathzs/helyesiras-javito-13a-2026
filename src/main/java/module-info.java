module com.example.helyesirasjavito13a2026 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;


    opens com.example.helyesirasjavito13a2026 to javafx.fxml;
    exports com.example.helyesirasjavito13a2026;
}