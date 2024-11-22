//Class
public class Demo {
    
    public static void main(String[] args) {
        System.out.println();
        Person alex = new Person("Alex DeLarge", 28, "M");
        System.out.println(alex);
        System.out.println();
        Student daisy = new Student("Daisy Masey", 17, "F", "777", 3.3);
        System.out.println(daisy);
        System.out.println();
        Teacher horton  = new Teacher("Horton Who", 41, "M", "Anthropology", 80000);
        System.out.println(horton);
        System.out.println();
        CollegeStudent carrie = new CollegeStudent("Carrie White", 18, "F", "666", 3.4, "Anthropology", 2 );
        System.out.println(carrie);
    }
    
}
