package part3;

public class Circle implements Figure {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getRadius() {
        return this.radius;
    }
}
