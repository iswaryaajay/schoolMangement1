/*
 *
 * School Management
 *
 * Students
 *
 */
package collection;

import java.util.HashSet;
import java.util.Scanner;

public class SchoolManagement {
    private static final HashSet<Student> students = new HashSet<>();

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        students.add(new Student("Ajay","ajay@gmail.com"));
        students.add(new Student("Aswitha","aswitha@gmail.com"));
        students.add(new Student("dhoni","Dhoni@gmail.com"));
        students.add(new Student("Surya","surya2111@gmail.com"));

        System.out.println("Enter a name:");
        final String name = scanner.nextLine();

        System.out.println("Enter an email address:");
        final String email = scanner.nextLine();

        if (Admitted(email)) {
            System.out.println("student is already admitted in the school");
        } else if (sameName(name)) {
            System.out.println("your Name already admitted in the school ");
        } else {
            final Student newStudent = new Student(name, email);

            addStudent(newStudent);
            System.out.println(newStudent);
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static final void  addStudent(Student student) {
        students.add(student);
    }

    public static final boolean Admitted(String email) {
        for (Student student : students) {
            if (student.getEmailAddress().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean sameName(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
class Student {
            private String name;
            private String emailAddress;

            public Student(final String name, final String emailAddress) {
                this.name = name;
                this.emailAddress = emailAddress;
            }

            public final String getName() {
                return name;
            }

            public final void setName(String name) {
                this.name = name;
            }

            public final String getEmailAddress() {
                return emailAddress;
            }

            public final  void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
            }

            public final String toString() {
                return "name:"+ name + ", Email:"+ emailAddress;

            }
}
