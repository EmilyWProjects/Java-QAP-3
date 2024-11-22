//Class
public class Demo {


    //Test
    public static void main(String[] args) {
        System.out.println();
        Point point = new Point(1.3f, 2.8f);
        System.out.println("Point: " + point);
        System.out.println();
        point.setXY(4.3f, 4.8f);
        System.out.println("New Point: " + point);
        System.out.println();
        MovablePoint movablePoint = new MovablePoint(0.8f, 2.3f, 0.3f, 0.3f);
        System.out.println("Moved point: " + movablePoint);
        System.out.println();
        movablePoint.setSpeed(0.8f, 0.8f);
        movablePoint.move();
        System.out.println("Moved point and speed altered: " + movablePoint);
    }
    
    
}
