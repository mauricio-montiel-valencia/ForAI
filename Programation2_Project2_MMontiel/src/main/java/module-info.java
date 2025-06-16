module com.mycompany.programation2_project2_mmontiel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.programation2_project2_mmontiel to javafx.fxml;
    exports com.mycompany.programation2_project2_mmontiel;
}
