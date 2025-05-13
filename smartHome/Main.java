package smartHome;

public class Main {
    public static void main(String[] args) {
        HomeController homeController = new HomeController();

        // 인스턴스 멤버 이너 클래스 객체 생성
        HomeController.Light light = homeController.new Light();
        light.turnOn();
        light.turnOff();

        // 정적 멤버 이너 클래스 객체 생성
        HomeController.Door door = new HomeController.Door();
        door.turnOn();
        door.turnOff();

        // 지역 이너 클래스
        homeController.controlAllDevices();

        // 익명 이너 클래스
        HomeController.Device device = new HomeController.Device() {
            @Override
            public void turnOn() {
                System.out.println("TV가 켜졌습니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV가 꺼졌습니다.");
            }
        };
        device.turnOn();
        device.turnOff();
    }
}
