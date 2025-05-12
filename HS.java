class Example<T> {
    private String name;
    private int age;
    private T appointmentDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(T appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Example(String name, int age, T appointmentDate) {
        setName(name);
        setAge(age);
        setAppointmentDate(appointmentDate);
    }

    @Override
    public String toString() {
        return "예약 = " + "환자 : " + name + ", 나이 : " + age + ", 예약일 : " + appointmentDate;
    }

}

public class HS {
    public static void main(String[] args) {
        Example<String> a = new Example<>("아무개", 15, "2025-05-15");
        Example<String> b = new Example<>("김이나", 23, "2025-05-25");
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

}
