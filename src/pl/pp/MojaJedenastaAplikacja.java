package pl.pp;
import java.util.*;

public class MojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Znajdź studenta z najwyższą średnią ocen
        Student najlepszyStudent = Collections.max(students, Comparator.comparingDouble(Student::getSredniaOcen));
        System.out.println("Student z najwyższą średnią: " +
                najlepszyStudent.getImie() + " " + najlepszyStudent.getNazwisko() + " (" +
                najlepszyStudent.getNumerIndeksu() + ") - Average: " +
                najlepszyStudent.getSredniaOcen());

        // Posortuj studentów według nazwisk
        students.sort(Comparator.comparing(Student::getNazwisko));
        System.out.println("Studenci posortowani według nazwisk:");
        for (Student student : students) {
            System.out.println(student.getImie() + " " + student.getNazwisko() +
                    " (" + student.getNumerIndeksu() + ") - Average: " +
                    student.getSredniaOcen());
        }

        // Oblicz średnią ocen wszystkich studentów
        double sredniaWszystkich = students.stream().mapToDouble(Student::getSredniaOcen).average().orElse(0.0);
        System.out.println("Średnia ocen wszystkich studentów: " + sredniaWszystkich);
    }
}
