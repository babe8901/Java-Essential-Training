package inheritance.shapes;

public sealed class Shape permits Rectangle, Circle {
    public Shape() {
        System.out.println("This is a Shape");
    }
}
