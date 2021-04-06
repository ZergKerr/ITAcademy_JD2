package by.academy;

public class StudentTypeTwo implements Study {

    private final double talent;

    public StudentTypeTwo() {
        talent = Talent.setTalent();
    }

    @Override
    public double calculateTime(int timeForPractise) {
        return (((timeForPractise * 3) * 2) / talent);
    }
}