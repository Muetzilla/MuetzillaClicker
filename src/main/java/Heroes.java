public abstract class Heroes {

    protected double currentDPS;
    protected double currentPrice;
    protected double basicPrice;
    protected double basicDamage;
    public Heroes() {

    }
    protected abstract void newDamage();
    protected abstract void newPrice();
}
