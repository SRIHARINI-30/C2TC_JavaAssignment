package entityclassassignment1;

public class StudentDemo {
	public static void main(String[] args) {
        Student s1 = new Student(101, "Harini", "CSE");
        Student s2 = new Student(102, "Raj", "ECE");
        Student s3 = new Student(103, "Priya", "IT");

        System.out.println("Student Details:");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }

}
