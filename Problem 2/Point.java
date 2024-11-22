//Class
public class Point {


    //String details
    private float x;
    private float y;


    //Constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }


    //Get
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float[] getXY() {
        return new float[]{x, y};
    }


    //Set
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    //Result
    @Override
    public String toString() {
        return "Coordinates: (" + x + ", " + y + ")";
    }
    

}