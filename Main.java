import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] student_score = {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int max = student_score[0];
        int min = student_score[0];
        int sum = 0;


        System.out.println("학생 성적 결과");

        for (int i = 0; i < student_score.length; i++) {
            int student = student_score[i];
            String grade = "";
            String result = "";

            if (student >= 90) {
                grade = "A";
                result = "합격";
            } else if (student >= 80) {
                grade = "B";
                result = "합격";
            } else if (student >= 70) {
                grade = "C";
                result = "합격";
            } else if (student >= 60) {
                grade = "D";
                result = "합격";
            } else {
                grade = "F";
                result = "불합격";

            }
            System.out.println("학생" + (i + 1) + ": 성적 = " + student_score[i] + ", 평가 = " + grade + ", " + result);

            if (student == 100) {
                System.out.println("최고 점수 " + student_score[i] + "점 발견! 더 이상 최고 점수를 찾지 않습니다.");
            }

            if (student < 0) {
                System.out.println("오류입니다.");
                continue;
            }
            if (student > 100) {
                System.out.println("오류입니다.");
                continue;
            }
            if (student > max) {
                max = student;
            }
            if (student < min) {
                min = student;
            }
            sum += student;

        }
        double meanscore = (double) sum / student_score.length;


        System.out.println("전체 성적 평균:" + meanscore);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);


    }

}