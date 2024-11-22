//Class
public class Student extends Person {


    //String details
    protected String myIdNum;
    protected double myGPA;
    

    //Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }


    //Get
    public String getIdNum() { 
        return myIdNum; 
    }
    public double getGPA() { 
        return myGPA; 
    }


    //Set
    public void setIdNum(String idNum) { 
        this.myIdNum = idNum; 
    }
    public void setGPA(double gpa) { 
        this.myGPA = gpa; 
    }


    //Result
    @Override
    public String toString() {
        return super.toString() + ", Student ID #: " + myIdNum + ", GPA: " + myGPA;
    }


}