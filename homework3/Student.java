package homework3;

public class Student{
    String name;
    int age;
    float score;

    Student(String name, int age, float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    void printInfo() {
        System.out.println(name + ", " + age + ", " + score);
    }
}