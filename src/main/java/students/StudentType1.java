package students;

public class StudentType1 extends Student{

    public StudentType1( int number) {
        super( number);
    }

    public void calculateStudyHours(int studyHours){
        double razbor = studyHours/(getTalent()*3);
        System.out.printf("Студент %d с талантом %.1f потратит на учебу %.1f часов.\n", getNumber(), getTalent(), studyHours/getTalent());
        System.out.printf("Из них он %.1f часов потратит на разбор, %.1f часов на нахождение в потоке и %.1f часов на практику.\n", razbor, razbor, razbor);
        System.out.println();
    }
}