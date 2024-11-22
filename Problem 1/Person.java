//Class
public class Person {


    //String details
    protected String myName;
    protected int myAge;
    protected String myGender;


    //Constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }


    //Get
    public String getName() { 
        return myName; 
    }
    public int getAge() { 
        return myAge; 
    }
    public String getGender() { 
        return myGender; 
    }


    //Set
    public void setName(String name) { 
        this.myName = name; 
    }
    public void setAge(int age) { 
        this.myAge = age; 
    }
    public void setGender(String gender) { 
        this.myGender = gender; 
    }


    //Result
    @Override
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }


}