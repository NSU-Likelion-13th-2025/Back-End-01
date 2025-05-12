class Student {
    String name;
    int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public int sumScore() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public void printInfo() {
        int total = sumScore();
        System.out.println("학생 이름: " + name);
        System.out.println("점수 합계: " + total);
        if (total >= 100) {
            System.out.println("등급 : A");
        } else if (total >= 90) {
            System.out.println("등급 : B");
        } else if (total >= 80) {
            System.out.println("등급 : C");
        } else if (total >= 70) {
            System.out.println("등급 : D");
        } else {
            System.out.println("등급 : F");
        }


    }
}
class GraduateStudent extends Student {
    String subject;

    public GraduateStudent(String name, int[] scores, String subject) {
        super(name, scores);
        this.subject = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("학과 : " + subject);
    }

}

public class Main5 {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent("안서진", new int[]{95, 92, 88}, "지능정보통신공학과");
        graduateStudent.printInfo();


    }
}