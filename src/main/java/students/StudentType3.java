package students;

public class StudentType3 extends Student{

    public StudentType3(int number) {
        super(number);
    }

    public void calculateStudyHours(int studyHours){
        System.out.printf("Студент %d с талантом %.1f потратит на учебу %.1f часов.\n", getNumber(), getTalent(), studyHours*3/getTalent());
        System.out.printf("Все %.1f часов он потратит на практику.\n", studyHours*3/getTalent());
        System.out.println();
    }
}