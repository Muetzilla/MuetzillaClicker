package calculations;

import java.time.Instant;

public class RuntimeCalculations {

    private int clicks = 0;
    private int clicksForStage = 0;
    private int clickDamage = 1;
    private int clickerLevel = 1;
    private int clicksNeededForNextLevel = 10;

    int iceWolfCurrentLevel = 0;
    int IceWolfCurrentDamage = 10;

    long unixTimeEnd;
    long unixTimeStart;
    int clicksNeededForNextLevelIW = 10;

    public RuntimeCalculations() {
       unixTimeStart = Instant.now().getEpochSecond();
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
    public void clicksClicked(boolean clickWasPressed){
        if(clickWasPressed){
            clicks++;
        }
        System.out.println(clicks);
    }

    public int getClickerLevel() {
        return clickerLevel;
    }

    public void setClickerLevel(int clickerLevel) {
        this.clickerLevel = clickerLevel;
    }

    public int getClickDamage() {
        return clickDamage;
    }

    public void setClickDamage(int clickDamage) {
        this.clickDamage = clickDamage;
    }

    public int getClicksForStage() {
        return clicksForStage;
    }

    public void setClicksForStage(int clicksForStage) {
        this.clicksForStage = clicksForStage;
    }

    public int getClicksNeededForNextLevel() {
        return clicksNeededForNextLevel;
    }

    public void setClicksNeededForNextLevel(int clicksNeededForNextLevel) {
        this.clicksNeededForNextLevel = clicksNeededForNextLevel;
    }
}