import st1.Student;

public class Main3 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.introduce();

        Student student2 = new Student("안서진", 25, "22102250");
        student2.introduce();
    }
}