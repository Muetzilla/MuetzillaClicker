package controller;


import calculations.RuntimeCalculations;

public class GameframeController {
     RuntimeCalculations calc = new RuntimeCalculations();
    public void handleClickerAction(javafx.event.ActionEvent actionEvent) {
       calc.clicksClicked(true);
    }
}
