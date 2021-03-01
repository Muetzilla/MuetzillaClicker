package calculations;

import java.time.Instant;

public class RuntimeCalculations {

    int clicks = 0;
    int clicksForStage = 0;
    int clickDamage = 1;
    int clickerLevel = 1;
    int clicksNeededForNextLevel = 10;

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
}