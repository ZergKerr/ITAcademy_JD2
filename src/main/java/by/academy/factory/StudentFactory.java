package by.academy.factory;

import by.academy.StudentTypeOne;
import by.academy.StudentTypeThree;
import by.academy.StudentTypeTwo;
import by.academy.Study;

public class StudentFactory {

    public static Study createStudent(TypeStudent typeStudent){
        Study study = null;
        switch (typeStudent){
            case ONE:
                study = new StudentTypeOne();
                break;
            case TWO:
                study = new StudentTypeTwo();
                break;
                case THREE:
                study = new StudentTypeThree();
                break;
        }
        return study;
    }
}