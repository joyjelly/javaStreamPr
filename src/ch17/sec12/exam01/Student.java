package ch17.sec12.exam01;

public class Student {
    private String name;
    private String gender;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
