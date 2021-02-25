public class IceWolf extends Heroes {
    public IceWolf() {
        basicPrice = 10;
        basicDamage = 10;
        currentDPS = basicDamage;
        currentPrice = basicPrice;

    }

    @Override
    protected void newDamage() {
        currentDPS *= 1.25;
    }

    @Override
    protected void newPrice() {
        currentPrice *= 1.3;
    }
}
