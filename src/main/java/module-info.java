module org.example.mostrardatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.mostrardatos to javafx.fxml;
    exports org.example.mostrardatos;
}