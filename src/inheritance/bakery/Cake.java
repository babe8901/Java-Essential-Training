package inheritance.bakery;

public class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this.flavor = "vanilla";
        this.price = 9.99;
    }

    public Cake(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
