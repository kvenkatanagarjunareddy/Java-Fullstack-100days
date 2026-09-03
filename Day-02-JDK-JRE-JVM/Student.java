public class Student {

    int sid;
    String sname;
    String course;

    void display() {

        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.sid = 101;
        s1.sname = "Srikanth";
        s1.course = "Java Full Stack";

        Student s2 = new Student();

        s2.sid = 102;
        s2.sname = "Rahul";
        s2.course = "Java Full Stack";

        s1.display();
        s2.display();
    }
}
