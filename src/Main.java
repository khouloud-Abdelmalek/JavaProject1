import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 22));
        students.add(new Student(3, "Bob", 24));
        students.add(new Student(2, "Charlie", 23));

        System.out.println("Tous les étudiants :");
        management.displayStudents(students, System.out::println);

        System.out.println("\nÉtudiants avec un âge > 22 :");
        management.displayStudentsByFilter(students, s -> s.getAge() > 22, System.out::println);

        System.out.println("\nNoms des étudiants :");
        String names = management.returnStudentsNames(students, Student::getName);
        System.out.println(names);

        System.out.println("\nCréer un étudiant :");
        Student newStudent = management.createStudent(() -> new Student(4, "David", 21));
        System.out.println(newStudent);

        System.out.println("\nÉtudiants triés par ID :");
        List<Student> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        sortedStudents.forEach(System.out::println);

        System.out.println("\nÉtudiants en Stream :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
