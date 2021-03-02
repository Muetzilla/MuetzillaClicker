package calculations;

public class OfflineCalculations {
    private long unixTimeStart;
    private long unixTimeEnd;
    private long timeOffline;

    public OfflineCalculations(long unixTimeStart, long unixTimeEnd) {
        this.unixTimeStart = unixTimeStart;
        this.unixTimeEnd = unixTimeEnd;
       calculateOfflineClicks();
    }

    private void calculateOfflineClicks() {
        timeOffline = unixTimeStart - unixTimeEnd;
    }
}