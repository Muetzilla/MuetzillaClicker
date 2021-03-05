package calculations;

import java.time.Instant;

public class RuntimeCalculations {

    private double clicks = 0;
    private double clicksForStage = 0;
    private double clickDamage = 1;
    private double clickerLevel = 1;
    private double clicksNeededForNextLevel = 10;
    private double iceWolfCurrentLevel = 0;
    private double IceWolfCurrentDamage = 10;

    private long unixTimeEnd;
    private long unixTimeStart;
    int clicksNeededForNextLevelIW = 10;

    public RuntimeCalculations() {
       unixTimeStart = Instant.now().getEpochSecond();
    }

    public void setClicks(double clicks) {
        this.clicks = clicks;
    }
    public void clicksClicked(boolean clickWasPressed){
        if(clickWasPressed){
            clicks += clickDamage;
        }
        System.out.println(clicks);
    }

    public double getClickerLevel() {
        return clickerLevel;
    }

    public void setClickerLevel(double clickerLevel) {
        this.clickerLevel = clickerLevel;
    }

    public double getClickDamage() {
        return clickDamage;
    }

    public void setClickDamage(double clickDamage) {
        this.clickDamage = clickDamage;
    }

    public double getClicksForStage() {
        return clicksForStage;
    }

    public void setClicksForStage(double clicksForStage) {
        this.clicksForStage = clicksForStage;
    }

    public double getClicksNeededForNextLevel() {
        return clicksNeededForNextLevel;
    }

    public void setClicksNeededForNextLevel(double clicksNeededForNextLevel) {
        this.clicksNeededForNextLevel = clicksNeededForNextLevel;
    }

    public void clickerLevelUp(boolean levelUpClicked) {
        int nextLevelMulti = 4;
        int damageMulti = 3;
        if(levelUpClicked && clicks >= clicksNeededForNextLevel){
            clicks -= clicksNeededForNextLevel;
            clickDamage += ((clickerLevel / 2 + 3) * damageMulti);
            clicksNeededForNextLevel += ((clicksNeededForNextLevel / 3 + 1) * nextLevelMulti);
            clickerLevel++;
        }
        System.out.println(clicksNeededForNextLevel);
        System.out.println(clickerLevel);
    }
}