package students;

public abstract class Student implements Study {

    private final int number;
    private final double talent = Talent.createTalent();

    public Student(int number) {
        this.number = number;
    }

    public double getTalent() {
        return talent;
    }

    public int getNumber(){
        return number;
    }
}