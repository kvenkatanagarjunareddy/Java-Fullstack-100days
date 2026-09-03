public class Employee {

    int eid;
    String name;
    double salary;

    void display() {

        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.eid = 101;
        e1.name = "Rahul";
        e1.salary = 45000;

        e1.display();
    }
}
