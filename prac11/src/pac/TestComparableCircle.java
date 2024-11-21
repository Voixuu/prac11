package pac;
//задание2
public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.0);
        ComparableCircle circle2 = new ComparableCircle(3.0);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        Shape largerCircle = Shape.max(circle1, circle2);
        System.out.println("Наибольший: " + largerCircle);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Shape largerShape = Shape.max(circle1, rectangle);
        System.out.println("наибольший между кругом и прямоугольником: " + largerShape);
    }
}