public class Student {

    String name;
    int age;
    float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void printInfo(){
        System.out.println("이름 : " + name + "나이 : " + age + "점수: " + score);
    }

    public float getScore(){
        return score;
    }

}