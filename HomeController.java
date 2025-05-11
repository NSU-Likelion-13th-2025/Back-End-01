public class HomeController {

    class LightDevice implements Device {
        public void turnOn() {
            System.out.println("조명이 켜졌습니다.");
        }

        public void turnOff() {
            System.out.println("조명이 꺼졌습니다.");
        }
    }

    static class DoorDevice implements Device {
        public void turnOn() {
            System.out.println("문이 열렸습니다.");
        }

        public void turnOff() {
            System.out.println("문이 닫혔습니다.");
        }
    }

    interface Device {
        void turnOn();
        void turnOff();
    }

    public void controlAllDevices() {
        class AirConditioner implements Device {
            public void turnOn() {
                System.out.println("에어컨이 켜졌습니다.");
            }

            public void turnOff() {
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }
        Device CD = new AirConditioner();
        CD.turnOn();
        CD.turnOff();


        Device tv = new Device() {
            public void turnOn() {
                System.out.println("TV가 켜졌습니다.");
            }

            public void turnOff() {
                System.out.println("TV가 꺼졌습니다.");
            }
        };
        tv.turnOn();
        tv.turnOff();
    }

    public static void main(String[] args) {
        HomeController controller = new HomeController();
        Device LightDevice = controller.new LightDevice();
        LightDevice.turnOn();
        LightDevice.turnOff();
        Device DoorDevice = new DoorDevice();
        DoorDevice.turnOn();
        DoorDevice.turnOff();
        controller.controlAllDevices();


    }
}



