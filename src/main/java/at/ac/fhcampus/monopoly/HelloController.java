package at.ac.fhcampus.monopoly;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button startButton;

    private boolean start = true;

    private final Random rnd = new Random();

    @FXML
    protected void onHelloButtonClick() {
        if(start){
            if(rnd.nextBoolean()){
                welcomeText.setText("Du hast verloren! ist halt ein schweres Monopoly...");
            }
            else{
                welcomeText.setText("Du wurdest reich geboren und hast gewonnen! Gut gemacht 👍");
            }
            startButton.setText("zurück zum Hauptmenü");
            start = false;
        }
        else{
            welcomeText.setText("Monopoly auf Wienerisch");
            startButton.setText("Start");
            start = true;
        }
    }
}