
import controller.GameframeController;

import java.awt.event.ActionEvent;
import java.time.Instant;

public class Main {

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


    public Main() {
        unixTimeStart = Instant.now().getEpochSecond();
        GameframeController gfc = new GameframeController();
        HeroesRun heroesRun = new HeroesRun("TEST");
        heroesRun.start();

    }

    public static void main(String[] args) {
      new Main();
      MainFx.main(args);
    }

    private void initComponents() {

    }


    public void actionPerformed(ActionEvent e) {
       /* if (e.getSource() == button) {
            clicks += clickDamage;
            clicksForStage++;
            label.setText("Klicks: " + clicks);
            levelCost.setText("Level Kosten: " + clicksNeededForNextLevel);
            stage();


        } else if (e.getSource() == levelUp && clicks >= clicksNeededForNextLevel) {
            System.out.println("Level Up pressed!");
            clickerLevelUp();
        } else if (e.getSource() == iceWolfButton && clicks >= clicksNeededForNextLevelIW) {
            System.out.println("Level UP Ice Wolf");
            iceWolfLevelUp();
        }
    }

    private void iceWolfLevelUp() {
        clicks -= clicksNeededForNextLevelIW;
        iceWolfCurrentLevel++;
        label.setText("Klicks: " + clicks);
        iceWolfDamageLabel.setText("Akuteller Schaden: " + IceWolfCurrentDamage);
        iceWolfLabel.setText("Aktuelles Level: " + iceWolfCurrentLevel);
        iceWolfLevel.setText("Level Kosten: " + clicksNeededForNextLevelIW);
    }

    private void stage() {
        Color color = randomBackgroundColorStage();
        if (clicksForStage <= MAX_VALUE) {
            pbar.setValue(clicksForStage);
        } else {
            clicksForStage = 0;
            button.setBackground(color);
            button.setForeground(color);
        }

    }

    private void clickerLevelUp() {
        int nextLevelMulti = 4;
        int damageMulti = 3;
        clicks -= clicksNeededForNextLevel;
        clickDamage += ((clickerLevel / 2 + 3) * damageMulti);
        clicksNeededForNextLevel += ((clicksNeededForNextLevel / 3 + 1) * nextLevelMulti);

        clickerLevel++;
        label.setText("Klicks: " + clicks);
        currentDamage.setText("Akuteller Schaden: " + clickDamage);
        currentLevel.setText("Aktuelles Level: " + clickerLevel);
        levelCost.setText("Level Kosten: " + clicksNeededForNextLevel);

    }

    private Color randomBackgroundColorStage() {
        Color color = new Color((int) (Math.random() * 0x1000000));
        return color;
    }


    public static void main(String[] args) {
        new Main();
    }*/
    }
}