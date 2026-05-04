import java.util.ArrayList;

public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Student Record Manager");

        addStudent("Alice");
        addStudent("Bob");

        viewStudents();

        searchStudent("alice");

        updateStudent("Bob", "Bobby");

        viewStudents();

        deleteStudent("Alice");

        countStudents();
    }

    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }

    static void viewStudents() {
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    static void searchStudent(String name) {
        for (String student : students) {
            if (student.equalsIgnoreCase(name)) {
                System.out.println(student + " found.");
                return;
            }
        }
        System.out.println(name + " not found.");
    }

    static void updateStudent(String oldName, String newName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equalsIgnoreCase(oldName)) {
                students.set(i, newName);
                System.out.println(oldName + " updated to " + newName + ".");
                return;
            }
        }
        System.out.println(oldName + " not found.");
    }

    static void deleteStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    static void countStudents() {
        System.out.println("Total students: " + students.size());
    }
}