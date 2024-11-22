//Class
public class Triangle extends Shape {


    //String details
    protected double side1, side2, side3;


    //Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Triangle has invalid side values");
        }
    }


    //Get
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    @Override
    public double getArea(){
        //calculate semi-perimeter of triangle for area formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


    //Method
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }


}
