package homework3;

public class StudentManager {
    Student[] students;
    int count = 0;

    StudentManager(int length){
        students = new Student[length];
    }

    void addstudent(String name, int age, float score) {
        if (count == students.length) {
            System.out.println("error"); // 배열에 지정된 크기보다 넘어감
            return;
        }
        students[count] = new Student(name, age, score);
        count++;
    }

    void printAllStudent(){
        for (int i = 0; i < count; i++) { // i를 배열의 길이만큼 했을 땐 null 값이 포함되서 에러가 발생
            students[i].printInfo();
        }
    }

    void printAverageScore(){
        double avg = 0;
        for (int i = 0; i < count; i++) {
            avg += students[i].score;
        }
        System.out.println("평균 : " + (avg /= count));
    }

    void printTopStudent(){
        int top = 0;
        for (int i = 1; i < count; i++) {
            if (students[0].score < students[i].score) {
                top = i;
            }
        }
        System.out.print("최고 성적 : ");
        students[top].printInfo();
    }

}