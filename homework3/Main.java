package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 학생 정보 추가(이름, 나이, 성적)");
        System.out.println("2. 전체 학생 정보 출력");
        System.out.println("3. 평균 성적 계산 및 출력");
        System.out.println("4. 최고 성적 학생 정보 출력");

        StudentManager studentManager = new StudentManager(10);

        while (true) {
            System.out.print("메뉴를 입력해주세요 :");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("이름:");
                    String name = sc.next();
                    System.out.print("나이:");
                    int age = sc.nextInt();
                    System.out.print("성적:");
                    float score = sc.nextFloat();
                    studentManager.addstudent(name, age, score);
                    break;
                case 2:
                    studentManager.printAllStudent();
                    break;
                case 3:
                    studentManager.printAverageScore();
                    break;
                case 4:
                    studentManager.printTopStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
