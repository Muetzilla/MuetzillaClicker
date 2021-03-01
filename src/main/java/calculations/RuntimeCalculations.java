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
            clicks += clickDamage;
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