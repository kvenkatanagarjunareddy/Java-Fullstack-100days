class Student {
    int id;
    String name;
    String course;
    double fees;

    void display() {
        // Display student details
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
        System.out.println("---------------------------");
    }
}

public class Test {
    public static void main(String[] args) {
        // Create Student object 1
        Student obj1 = new Student();
        
        // Assign details
        obj1.id = 101;
        obj1.name = "Rahul Sharma";
        obj1.course = "Java Full Stack";
        obj1.fees = 45000.0;
        
        // Display details
        obj1.display();

        // Create Student object 2
        Student obj2 = new Student();
        
        // Assign details
        obj2.id = 102;
        obj2.name = "Priya Patel";
        obj2.course = "Data Science";
        obj2.fees = 55000.0;
        
        // Display details
        obj2.display();
    }
}
