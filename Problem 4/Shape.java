//Class
public abstract class Shape implements Scalable  {


    //String details
    protected String name;


    //Constructor
    public Shape(String name) {
        this.name = name;
    }


    //Get
    public abstract double getPerimeter();
    public abstract double getArea();


    //Result
    @Override
    public String toString() {
        return "Shape: " + name + ", Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }


}
