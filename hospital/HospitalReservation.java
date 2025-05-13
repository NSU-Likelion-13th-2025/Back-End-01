package hospital;

class Hospital<T> {
    private T name;
    private T age;
    private T appointmentDate;

    public Hospital(T name, T age, T appointmentDate) {
        setName(name);
        setAge(age);
        setDate(appointmentDate);
    }

    public T getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

    public T getDate() {
        return appointmentDate;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void setDate(T appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString(){
        return "환자: " + name + ", 나이: " + age + ", 예약일: " + appointmentDate;
    }

}

public class HospitalReservation {
    public static void main(String[] args) {
        Hospital<String> hospital1 = new Hospital<>("이무개","15","2025-05-15");
        Hospital<String> hospital2 = new Hospital<>("김이나", "23", "2025-05-25");
        System.out.println("예약 = " + hospital1.toString());
        System.out.println("예약 = " + hospital2.toString());
    }
}
