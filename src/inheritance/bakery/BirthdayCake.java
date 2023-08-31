package inheritance.bakery;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake() {
        setFlavor("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
