//Class
public class Demo {


    //Variables
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle", 9),
                new Ellipse("Ellipse", 8, 4),
                new Triangle("Triangle", 2, 3, 4),
                new EquilateralTriangle("Equilateral Triangle", 7)
        };
        scaleShapes(shapes, 2);

    }


    //Test
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println();
        System.out.println("Before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
        System.out.println();
        System.out.println("After scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        };
    }

    
}
