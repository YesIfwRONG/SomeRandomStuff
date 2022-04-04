module com.example.guilessonnum2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guilessonnum2 to javafx.fxml;
    exports com.example.guilessonnum2;
}