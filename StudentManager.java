public class StudentManager {

    Student[] students;
    int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(String name, int age, float score) {
        if (count < students.length) {
            students[count] = new Student(name, age, score);
            count++;
        } else {
            System.out.println("학생 목록이 가득 찼습니다.");
        }

    }

    public void printAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i].printInfo();
        }
    }

    public void printAverageScore() {
        if (count == 0) return;

        float sum = 0;

        for (int i = 0; i < count; i++) {
            sum += students[i].getScore();
        }

        float average = sum / count;
        System.out.println("학생 펻균 점수 :" + average);
    }

    public void printTopStudents() {
        if (count == 0) return;

        Student topStudent = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getScore() > topStudent.getScore()) {
                topStudent = students[i];
            }
        }
        System.out.println("최고 성적 학생 : ");
        topStudent.printInfo();
    }
}