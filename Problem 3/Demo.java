//Class
public class Demo {

    
    //Test
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 9),
            new Ellipse("Ellipse", 8, 4),
            new Triangle("Triangle", 2, 3, 4),
            new EquilateralTriangle("Equilateral Triangle", 7)
        };
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape);
        }

    }
    
}
