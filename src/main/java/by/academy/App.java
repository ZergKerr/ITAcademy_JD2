package by.academy;

import by.academy.factory.StudentFactory;
import by.academy.factory.TypeStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Messagebundle");
        System.out.println(rb.getString("studentOne"));
        int time = 22;
        List<Study> group = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            group.add(StudentFactory.createStudent(TypeStudent.getRandom()));
        }
        group.forEach(i -> System.out.printf("%.1f \n", i.calculateTime(time)));
    }
}