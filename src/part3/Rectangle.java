package part3;

public class Rectangle implements Figure {
    private final double width, height;

    public Rectangle (double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
