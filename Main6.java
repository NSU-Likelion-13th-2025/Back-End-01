import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Student1[] students = new Student1[3]; // 학생 3명의 정보를 배열에 저장

        students[0] = new Student1("홍길동", 20, 178.2, 70.7, 1, "정보시스템공학과");// 학생 3명 초기화
        students[1] = new Student1("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student1("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        System.out.println(students[0].toString()); // 학생 정보 출력
        System.out.println(students[1].toString());
        System.out.println(students[2].toString());


        Employee[] employees = new Employee[10]; // 사원 10명의 정보를 배열에 저장
        employees[0] = new Employee("박보검", 28, 180.3, 72.0, 100000000, "영업부"); //사원 2명 초기화
        employees[1] = new Employee("강동원", 40, 182.0, 76.0, 200000000, "기획부");
        Scanner scanner = new Scanner(System.in); //키보드로 사원 정보 입력 받음
        int count = 2;//이미 앞에 2명이 있으므로 2부터 시작

        while (true) {//반복적으로 사원 정보 입력 받음
            System.out.println("이름 : ");
            String name = scanner.next();

            System.out.println("나이 : ");
            int age = scanner.nextInt();

            System.out.println("신장 : ");
            double height = scanner.nextDouble();

            System.out.println("몸무게 : ");
            double weight = scanner.nextDouble();

            System.out.println("급여 : ");
            int salary = scanner.nextInt();

            System.out.println("부서 : ");
            String dept = scanner.next();

            if (count >= 10) {//10명이 초과되면 입력 종료
                System.out.println("입력 횟수 초과");
                break;
            }
            employees[count] = new Employee(name, age, height, weight, salary, dept);//입력 받은 정보를 객체 생성하여 배열에 저장
            count++;


            System.out.println("계속 추가하시겠습니까? (y/n) : ");//한명 입력 받을때마다 계속 입력할건지 물음
            if (scanner.next().equalsIgnoreCase("n")) {//y면 계속 입력받고 n이면 종료(equals는 대소문자 구분, equalsIgnoreCase는 대소문자 구분X)
                break;
            }

        }
        for (int i = 0; i < count; i++) {//입력된 사원 정보 모두 출력
            System.out.println((i+1) + employees[i].toString());
        }


    }
}