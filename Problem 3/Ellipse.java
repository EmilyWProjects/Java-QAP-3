//Class
public class Ellipse extends Shape {


    //String details
    protected double a;  
    protected double b;  


    //Constructor
    public Ellipse(String name, double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    
    //Get
    @Override
    public double getPerimeter() {
        return Math.PI * (2 * Math.sqrt((a * a + b * b) / 2));
    }
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    
}
