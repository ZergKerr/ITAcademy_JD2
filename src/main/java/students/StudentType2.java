package students;

public class StudentType2 extends Student{

    public StudentType2(int number) {
        super(number);
    }

    public void calculateStudyHours(int studyHours){
        double razbor = studyHours/getTalent();
        System.out.printf("Студент %d с талантом %.1f потратит на учебу %.1f часов.\n", getNumber(), getTalent(), studyHours*2/getTalent());
        System.out.printf("Из них он %.1f часов потратит на разбор и %.1f часов на практику.\n", razbor, razbor);
        System.out.println();
    }
}