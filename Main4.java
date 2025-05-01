import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요 : ");
        int size = sc.nextInt();
        StudentManager studentManager = new StudentManager(size);

        while (true) {
            System.out.println(" 원하는 작업을 선택하세요: ");
            System.out.println(" 1. 학생 정보 추가");
            System.out.println(" 2. 학생 전체 출력");
            System.out.println(" 3. 학생 평균 출력");
            System.out.println(" 4. 최고 성적 학생 출력");
            System.out.println(" 5. 종료");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("이름 입력 : ");
                    String name = sc.next();

                    System.out.println("나이 입력 :");
                    int age = sc.nextInt();

                    System.out.println("점수 입력 : ");
                    float score = sc.nextFloat();

                    studentManager.addStudent(name, age, score);
                    break;

                case 2:
                    studentManager.printAllStudents();
                    break;

                case 3:
                    studentManager.printAverageScore();
                    break;

                case 4:
                    studentManager.printTopStudents();
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }


    }
}