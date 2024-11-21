package pac;
//задание3
public class MainColorable {
    public static void main(String[] args) {
        Shape[] objects = new Shape[5];
        objects[0] = new Square(2.0);
        objects[1] = new Square(3.5, "red", true);
        objects[2] = new Square(4.0);
        objects[3] = new Square(1.5, "blue", false);
        objects[4] = new Square(5.0);

        for (Shape obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
