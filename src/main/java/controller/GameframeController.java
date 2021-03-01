package controller;


import calculations.RuntimeCalculations;

public class GameframeController {
     RuntimeCalculations calc = new RuntimeCalculations();
    public void handleClickerAction(javafx.event.ActionEvent actionEvent) {
       calc.clicksClicked(true);
    }
    public void handleLevelUpAction(javafx.event.ActionEvent actionEvent) {
        calc.clickerLevelUp(true);
    }
}
