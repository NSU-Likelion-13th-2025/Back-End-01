package smartHome;

public class HomeController {
    static interface Device {
        void turnOn();
        void turnOff();
    }

    class Light implements Device {
        public void turnOn() {
            System.out.println("조명이 켜졌습니다.");
        }

        public void turnOff() {
            System.out.println("조명이 꺼졌습니다.");
        }
    }

    static class Door implements Device {
        public void turnOn() {
            System.out.println("문이 열렸습니다.");
        }
        public void turnOff() {
            System.out.println("문이 닫혔습니다.");
        }
    }

    void controlAllDevices() {
        class AirConditioner implements Device {
            public void turnOn() {
                System.out.println("에어컨이 켜졌습니다.");
            }
            public void turnOff() {
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }

        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.turnOff();
    }
}
