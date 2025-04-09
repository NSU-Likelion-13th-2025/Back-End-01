public class Homework1 {
    public static void main(String[] args) {
        int[] grades = new int[] {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};

        System.out.println("학생 성적 결과");

        int min = grades[0];
        int max = grades[0];
        int avg = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 100 || grades[i] < 0) {
                System.out.println("점수 오류!!");
                continue;
            }

            if (min > grades[i]) {
                min = grades[i];
            }

            if (max < grades[i]) {
                max = grades[i];
            }

            avg += grades[i];

            switch (grades[i] / 10) {
                case 10:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = A, 합격");
                    max = grades[i];
                    break;
                case 9:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = A, 합격");
                    break;
                case 8:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = B, 합격");
                    break;
                case 7:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = C, 합격");
                    break;
                case 6:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = D, 합격");
                    break;
                default:
                    System.out.println("학생 " + (i + 1) + ": 성적 = " + grades[i] + ", 평가 = F, 불합격");
                    break;
            }
        }
        System.out.println("최고 점수 " + max + "점 발견 ! 더 이상 최고 점수를 찾지 않습니다.");
        System.out.println("전체 성적 평균: " + (float) (avg / 10.0));
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
    }
}
