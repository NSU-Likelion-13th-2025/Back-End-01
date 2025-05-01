package st1;

public class Student {
    String name;
    int age;
    String studentid;

    public Student() {
        this.name = "홍길동";
        this.age = 20;
        this.studentid = "25123456";

    }

    public Student(String name, int age, String studentid) {
        this.name = name;
        this.age = age;
        this.studentid = studentid;
    }

    public void introduce() {

        System.out.println("학생 이름:" + name + "\n학생 나이:" + age + "\n학생 학번:" + studentid);
    }
}
