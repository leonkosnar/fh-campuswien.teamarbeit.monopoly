module at.ac.fhcampus.monopoly {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens at.ac.fhcampus.monopoly to javafx.fxml;
    exports at.ac.fhcampus.monopoly;
}