package controller;


import calculations.RuntimeCalculations;
import javafx.fxml.FXML;

import java.awt.*;

public class GameframeController {
     RuntimeCalculations calc = new RuntimeCalculations();
    public void handleClickerAction(javafx.event.ActionEvent actionEvent) {
       calc.clicksClicked(true);
    }
    public void handleLevelUpAction(javafx.event.ActionEvent actionEvent) {
        calc.clickerLevelUp(true);
        setLevelUp();
    }
    public void setLevelUp(){
        Label levelUpCosts = new Label();
        levelUpCosts.setText("It is doing the work");
    }
}
