import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.Instant;

public class Main extends JFrame implements ActionListener {


    JProgressBar pbar;
    JButton button;
    JLabel label;
    JLabel currentLevel;
    JPanel head;
    JPanel footer;
    JPanel left;
    JPanel right;
    JPanel panelIceWolf;
    JLabel levelCost;
    JLabel pbarTitel;
    JLabel currentDamage;
    JButton levelUp;
    JButton iceWolfButton;
    JLabel iceWolfLabel;
    JLabel iceWolfLevel;
    Icon buttonIcon;

    int clicks = 0;
    int clicksForStage = 0;
    int clickDamage = 1;
    int clickerLevel = 1;
    int clicksNeededForNextLevel = 10;

    int iceWolfCurrentLevel = 0;

    long unixTimeEnd;
    long unixTimeStart;
    final int MAX_VALUE = 100;
    final int MIN_VALUE = 0;
    int clicksNeededForNextLevelIW = 10;


    public Main() {
        unixTimeStart = Instant.now().getEpochSecond();
        initComponents();
        HeroesRun heroesRun = new HeroesRun("TEST");
        heroesRun.start();
    }

    private void initComponents() {
        setSize(1000, 500);
        setTitle("MuetzillaClicker");
        GridLayout headerLayout = new GridLayout(0, 5);
        GridLayout footerLayout = new GridLayout(2, 1);
        GridLayout leftLayout = new GridLayout(0, 2);
        GridLayout heroesLayout = new GridLayout(2, 1);


        //Init
        head = new JPanel();
        footer = new JPanel();
        left = new JPanel();
        right = new JPanel();

        //Header
        levelCost = new JLabel("Level Kosten: " + clicksNeededForNextLevel);
        pbarTitel = new JLabel("Vortschritt in der aktuellen Stage");
        currentDamage = new JLabel("Aktueller Schaden:" + clickDamage);
        label = new JLabel("Klicks: " + clicks);
        currentLevel = new JLabel("Aktuelles Level: " + clickerLevel);
        levelUp = new JButton("LEVEL UP Clicker");

        //Center
        buttonIcon = new ImageIcon("images/clicker.png");
        button = new JButton(buttonIcon);
        button.setMnemonic('O');

        //Center - Left
        //IceWolf
        iceWolfButton = new JButton("IceWolf");
        iceWolfLabel = new JLabel("Ice Wolf Level:" + iceWolfCurrentLevel);
        iceWolfLevel = new JLabel("Kosten: " + clicksNeededForNextLevelIW);
        panelIceWolf = new JPanel();

        //Footer
        pbar = new JProgressBar();
        pbar.setMinimum(MIN_VALUE);
        pbar.setMaximum(MAX_VALUE);
        pbar.setStringPainted(true);

        //Hinzufügen

        add(head, BorderLayout.NORTH);
        add(footer, BorderLayout.SOUTH);
        add(left, BorderLayout.WEST);
       // add(right, BorderLayout.EAST);

        //Head
        head.setLayout(headerLayout);
        head.add(label);
        head.add(currentDamage);
        head.add(currentLevel);
        head.add(levelCost);
        head.add(levelUp);

        //Main Center
        add(button, BorderLayout.CENTER);

        //Main Left
        left.setLayout(leftLayout);
        left.add(panelIceWolf);
        panelIceWolf.setLayout(heroesLayout);
        panelIceWolf.add(iceWolfLabel);
        panelIceWolf.add(iceWolfLevel);
        left.add(iceWolfButton);

        //Footer
        footer.setLayout(footerLayout);
        footer.add(pbarTitel);
        footer.add(pbar);

        //Action Listener
        button.addActionListener(this);
        levelUp.addActionListener(this);
        iceWolfButton.addActionListener(this);



        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                unixTimeEnd = Instant.now().getEpochSecond();
                System.exit(0);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            clicks += clickDamage;
            clicksForStage++;
            label.setText("Klicks: " + clicks);
            levelCost.setText("Level Kosten: " + clicksNeededForNextLevel);
            stage();


        } else if (e.getSource() == levelUp && clicks >= clicksNeededForNextLevel) {
            System.out.println("Level Up pressed!");
            clickerLevelUp();
        }else if(e.getSource() == iceWolfButton && clicks >= clicksNeededForNextLevelIW){
            System.out.println("Level UP Ice Wolf");
        }
    }

    private void stage() {

        if (clicksForStage <= MAX_VALUE) {
            pbar.setValue(clicksForStage);
        }else{
            clicksForStage = 0;
            button.setBackground(Color.RED);
            button.setForeground(Color.ORANGE);
        }

    }

    private void clickerLevelUp() {
        int nextLevelMulti = 4;
        int damageMulti = 3;
        clicks -= clicksNeededForNextLevel;
        clickDamage += (clickerLevel / 2 * damageMulti + 2);
        clicksNeededForNextLevel += (clicksNeededForNextLevel / 3 * nextLevelMulti + 1);

        clickerLevel++;
        label.setText("Klicks: " + clicks);
        currentDamage.setText("Akuteller Schaden: " + clickDamage);
        currentLevel.setText("Aktuelles Level: " + clickerLevel);
        levelCost.setText("Level Kosten: " + clicksNeededForNextLevel);

    }




    public static void main(String[] args) {
        new Main();
    }
}