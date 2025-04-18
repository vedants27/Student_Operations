
#  Student_Operations


###  Description:
This is a **menu-driven Java program** to demonstrate the use of:
- **Classes and Objects**
- **Constructors**
- **ArrayList (Array of Objects)**
- **Instance Members**
- **Encapsulation using Getters and Setters**

The program simulates a basic **Student Record Management System**, allowing the user to add, view, search, update, and delete student records.

---

###  File Structure:
| File Name               | Purpose |
|------------------------|---------|
| `Main.java`            | Contains the main method and menu-based UI |
| `Student.java`         | Contains the blueprint for the Student object |
| `StudentOperations.java` | Contains all the core operations related to student records |

---

###  Concepts Used:
- **Object-Oriented Programming**
- **Encapsulation**
- **ArrayList of Objects**
- **Menu-Driven Programming**
- **Scanner for User Input**
- **Method Abstraction and Reusability**

---

###  Features & Functions:

####  `Main.java`
- Displays a user-friendly menu
- Handles user input for operations
- Calls appropriate methods from `StudentOperations.java`

####  `Student.java`
- Defines private member variables:
  - `name`, `prn`, `branch`, `batch`, `cgpa`
- Provides:
  - **Constructor** for initialization
  - **Getter/Setter** methods for encapsulation
  - `display()` method to print student details

####  `StudentOperations.java`
Includes the following key methods:

| Method Name            | Description |
|------------------------|-------------|
| `addStudents(Student student)` | Adds a new student to the ArrayList |
| `displayStudents()` | Displays all students |
| `searchByPRN(long prn)` | Finds a student by PRN |
| `searchByName(String name)` | Finds a student by name |
| `searchByPosition(int index)` | Finds a student by index (position in list) |
| `updateStudent(long prn, String name, String branch, String batch, double cgpa)` | Updates details of a student by PRN |
| `deleteStudent(long prn)` | Deletes a student record by PRN |

---

###  Sample Menu

```text
Menu:
1. Add Student
2. Display Students
3. Search Student by PRN
4. Search Student by Name
5. Search Student by Position
6. Update Student Details
7. Delete Student
0. Exit
```

---

###  How to Run:
1. Compile all `.java` files:
   ```bash
   javac Main.java https://github.com/vedants27/Student_Operations
   ```
2. Run the program:
   ```bash
   java Main
   ```

---
