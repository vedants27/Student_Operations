//StudentOperations.java

import java.util.*;

class StudentOperations {
    ArrayList<Student> students; // ArrayList to store Student objects

    public StudentOperations() {
        this.students = new ArrayList<>();

        // Method to add students to the ArrayList
    public void addStudents(Student student) {
        students.add(student);
        System.out.println("Student added.");
    }

    // Method to Display Student Details
    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }
 
    }
}

