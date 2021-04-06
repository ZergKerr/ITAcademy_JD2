package by.academy;

public class StudentTypeOne implements Study{

    private final double talent;

    public StudentTypeOne(){
        talent = Talent.setTalent();
    }

    @Override
    public double calculateTime(int timeForPractise) {
        return ((timeForPractise*3)/ talent);
    }
}
