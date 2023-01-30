package part3;

public class Main {
    public static void main (String[] args) {
       Figure circle = new Circle(4);
       System.out.println(circle.getArea());

        Figure rectangle = new Rectangle(3,6);
       System.out.println(rectangle.getArea());

        Figure triangle = new Triangle(4,6);
        System.out.println(triangle.getArea());

        Figure[] arrayFigure = {circle, rectangle, triangle};
        System.out.println(totalAreaSum(arrayFigure));
    }

    private static double totalAreaSum (Figure[] arrayFigure) {
        int totalSum = 0;
        for (Figure figure : arrayFigure) {
            totalSum += figure.getArea();
        }
        return totalSum;
    }

}
