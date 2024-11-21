package pac;
//Задание1
public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "Red", true);
        Circle circle2 = new Circle(7, "Blue", false);
        Rectangle rectangle1 = new Rectangle(4, 6, "Green", true);
        Rectangle rectangle2 = new Rectangle(5, 3, "Yellow", false);
        System.out.println("Circle1: " + circle1);
        System.out.println("Circle2: " + circle2);
        System.out.println("Наибольший круг: " + Shape.max(circle1, circle2));
        System.out.println("Rectangle1: " + rectangle1);
        System.out.println("Rectangle2: " + rectangle2);
        System.out.println("Наибольший: " + Shape.max(rectangle1, rectangle2));
    }
}