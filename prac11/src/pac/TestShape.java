package pac;
//задание 4 и 5 и 6
public class TestShape {
    public static void main(String[] args) {
        Shape geoObject1 = new Circle(5);
        Shape geoObject2 = new Rectangle(5, 3);
        System.out.println("Одинаковая ли площадь у двух фигур? " +
                equalArea(geoObject1, geoObject2));
        displayShape(geoObject1);
        displayShape(geoObject2);
        Rectangle rect1 = new Rectangle(5, 5);
        Rectangle rect2 = new Rectangle(25, 1);
        System.out.println("\nПрямоугольники равны? " + rect1.equals(rect2));
        Shape[] shapes = {
                new Circle(5),
                new Circle(3),
                new Rectangle(4, 6),
                new Rectangle(2, 3)
        };
        double totalArea = sumArea(shapes);
        System.out.println("Общая площадь всех фигур: " + totalArea);
    }
    public static boolean equalArea(Shape object1, Shape object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayShape(Shape object) {
        System.out.println();
        System.out.println("Площадь равна " + object.getArea());
        System.out.println("Периметр равен " + object.getPerimeter());
    }
    public static double sumArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}