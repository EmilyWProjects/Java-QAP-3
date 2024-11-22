//Class
public class Teacher extends Person {


    //String details
    private String subject;
    private double salary;


    //Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }


    //Get
    public String getSubject() { 
        return subject; 
    }
    public double getSalary() { 
        return salary; 
    }


    //Set
    public void setSubject(String subject) { 
        this.subject = subject; 
    }
    public void setSalary(double salary) { 
        this.salary = salary; 
    }


    //Result
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
    
    
}
