//Class
public class CollegeStudent extends Student {
    

    //String details
    private String major;
    private int year;


    //Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    
    //Get
    public String getMajor() { 
        return major; 
    }
    public int getYear() { 
        return year; 
    }


    //Set
    public void setMajor(String major) { 
        this.major = major; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }


    //Result
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }


}
