package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {

    private int studyHours, size;
    private List<Student> student;

    public Group(int studyHours, List<Student> student) {
        this.studyHours = studyHours;
        this.student = student;
    }

    public Group() {
        createGroupParameters();
    }

    private void createGroupParameters() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i;
            System.out.println("Введите количество учебных часов:");
            String s = scanner.nextLine();
            try {
                i = Integer.parseInt(s);
                if (i > 0) {
                    studyHours = i;
                    break;
                } else {
                    System.out.println("Число учебных часов не может быть меньше либо равно 0.");
                }
            } catch (Exception ex) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз.");
            }
        }
        while (true) {
            int i;
            System.out.println("Введите количество студентов в группе:");
            String s = scanner.nextLine();
            try {
                i = Integer.parseInt(s);
                if (i > 0) {
                    size = i;
                    break;
                } else {
                    System.out.println("Количество студентов в группе не может быть меньше либо равно 0.");
                }
            } catch (Exception ex) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз.");
            }
        }
        scanner.close();
    }

    public int getStudyHours() {
        return studyHours;
    }

    public int getSize() {
        return size;
    }

    private void createStudyPlan(int size) {
        System.out.println("Группа из " + size + " студентов осваивает учебную программу в количестве " + getStudyHours() + " часов.");
        student.forEach(student -> student.calculateStudyHours(studyHours));
    }


    public static void main(String[] args) {
        Group gr = new Group();
        Group group = new Group(gr.getStudyHours(), createStudent(gr.getSize()));
        group.createStudyPlan(gr.getSize());
    }

    private static List<Student> createStudent(int size) {
        List<Student> student = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int j = i + 1;
            if (i % 3 == 0)
                student.add(new StudentType1(j));
            if (i % 3 == 1)
                student.add(new StudentType2(j));
            if (i % 3 == 2)
                student.add(new StudentType3(j));
        }
        return student;
    }
}