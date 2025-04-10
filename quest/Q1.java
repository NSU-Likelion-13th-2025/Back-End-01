package quest;

class Student {
    String name;
    int age;
    int studentid;

    Student() {
        name = "홍길동";
        age = 20;
        studentid = 25123456;
    }

    Student(String name, int age, int studentid) {
        this.name = name;
        this.age = age;
        this.studentid = studentid;
    }

    public void introduce() {
        System.out.println("학생 이름: " + name);
        System.out.println("학생 나이: " + age);
        System.out.println("학생 학번: " + studentid);
    }

}

public class Q1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.introduce();

        Student student2 = new Student("안다현", 22, 23101304);
        student2.introduce();
    }
}
