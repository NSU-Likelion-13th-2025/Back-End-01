package homework4;

public class GraduateStudent extends Student {
    String subject;

    GraduateStudent(String name, int[] scores, String subject) {
        super(name, scores);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("점수 합계: " + sumScores());

        if((sumScores()/3.0f) >= 95) {
            System.out.println("등급 : A+");
        } else if((sumScores()/3.0f) >= 90) {
            System.out.println("등급 : A");
        } else if((sumScores()/3.0f) >= 85) {
            System.out.println("등급 : B+");
        } else if((sumScores()/3.0f) >= 80) {
            System.out.println("등급 : B");
        } else if((sumScores()/3.0f) >= 75) {
            System.out.println("등급 : C+");
        } else if((sumScores()/3.0f) >= 70) {
            System.out.println("등급 : C");
        } else {
            System.out.println("등급 : F");
        }

        System.out.println("학과: " + subject);
    }
}
