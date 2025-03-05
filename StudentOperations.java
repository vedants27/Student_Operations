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

    // Search Student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

    // Search Student by Name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Search Student by Position (Index)
    public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) {
            return students.get(position);
        } else {
            System.out.println("Invalid position! Please enter a valid index.");
            return null;
        }
    }

    // Update Student Details by PRN
    public boolean updateStudent(long prn, String name, String branch, String batch, double cgpa) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(name);
            student.setBranch(branch);
            student.setBatch(batch);
            student.setCGPA(cgpa);
            System.out.println("Student details updated.");
            return true;
        }
        System.out.println("Student not found!");
        return false;
    }

    // Delete Student by PRN
    public boolean deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
            return true;
        }
        System.out.println("Student not found!");
        return false;
    }
}

