package part3;

public class Triangle implements Figure {
    private final double sideA, sideH;


    public Triangle (double a, double h) {
        this.sideA = a;
        this.sideH = h;
    }

    public double getArea() {
        return 0.5 * (this.sideA * this.sideH);
    }
}
