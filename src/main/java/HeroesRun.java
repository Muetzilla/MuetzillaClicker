import java.util.ArrayList;

public class HeroesRun implements Runnable {
    private Thread heroes;
    private final String threadName;

    public HeroesRun(String threadName) {
        this.threadName = threadName;
    }

    ArrayList<Heroes> heroesList = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("Thread running " + threadName);
        Heroes iceWolf = new IceWolf();
        heroesList.add(iceWolf);
        double iceWolfDamage = iceWolf.currentDPS;
        double iceWolfPrice = iceWolf.currentPrice;


        // Methods that should be executed HERE
        for (int i = 0; i < 60; i++) {


            System.out.println("Thread Running" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread ended " + threadName);
    }

    public void printHeroesOnFrame() {

    }

    public void start() {
        System.out.println("THREAD " + threadName + " STARTED");
        if (heroes == null) {
            heroes = new Thread(this, threadName);
            heroes.start();
        }
    }
}