package inheritance.bakery;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        setFlavor("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
