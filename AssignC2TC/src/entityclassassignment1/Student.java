package entityclassassignment1;

public class Student {
	int studentId;
    String name;
    String department;

    // Constructor
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Department: " + department);
    }
}
