package inheritance.shapes;

public sealed class Rectangle extends Shape permits Square {
    public Rectangle() {
        System.out.println("This is a Rectangle");
    }
}
