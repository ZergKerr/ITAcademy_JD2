package by.academy;

public class StudentTypeThree implements Study {

    private final double talent;

    public StudentTypeThree() {
        talent = Talent.setTalent();
    }

    @Override
    public double calculateTime(int timeForPractise) {
        return (((timeForPractise * 3) * 3) / talent);
    }
}
